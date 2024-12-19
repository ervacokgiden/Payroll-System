import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String args[])
    {
        Worker worker1 = new Worker("Erva","Çokgiden",1,45,2017,84000.00,"Hukuk","Elis");
        Worker worker2 = new Worker("Ceren","Bulut",2,45,2018,62000.00,"Pazarlama","Nisa Nur");
        Worker worker3 = new Worker("Melisa","Günay",3,40,2024,75000.00,"Satın Alma","Züleyha");
        Worker worker4 = new Worker("Ali Kağan","Yeşil",4,35,2021,110000.00,"IT","Bekir");


        System.out.println("Worker1 salary:");
        System.out.println(worker1.getSalary());
        System.out.println("Worker2 salary:");
        System.out.println(worker2.getSalary());
        System.out.println("Worker3 salary:");
        System.out.println(worker3.getSalary());
        System.out.println("Worker4 salary:");
        System.out.println(worker4.getSalary());

        List <Worker> myWorkers = new ArrayList <Worker>();

        myWorkers.add(worker1);
        myWorkers.add(worker2);
        myWorkers.add(worker3);
        myWorkers.add(worker4);


        System.out.println("Worker names starts with E");
        myWorkers.stream()
                .filter((p) -> p.name.startsWith("E"))
                .map((p) -> p.name.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));


        Map<String, List<Worker>> departmentMap = new HashMap<>();


        for (Worker worker : myWorkers) {
            departmentMap.computeIfAbsent(worker.departmentName, k -> new ArrayList<>()).add(worker);
        }

        System.out.println("\nWorkers grouped by department:");
        departmentMap.forEach((department, workers) -> {
            System.out.println("Department: " + department);
            for (Worker worker : workers) {
                System.out.println("- " + worker.name + " " + worker.lastName);
            }
        }
        );
    }
}