class Worker extends Employee
{
    String departmentName;
    String managerName;

    public Worker(){}

    public Worker(String name,String lastName,int id,int workHour,int hireYear,double salary,String departmentName,String managerName)
    {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.workHour = workHour;
        this.hireYear = hireYear;
        this.salary = salary;
        this.departmentName = departmentName;
        this.managerName = managerName;
    }

    public void setManager(String managerName){
        this.managerName = managerName;
    }
    public String getManager(){
        return this.managerName;
    }

    public void setdepartment(String departmentName){
        this.departmentName = departmentName;
    }
    public String getdepartment(){
        return this.departmentName;
    }
}