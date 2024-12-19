class Employee implements IEmployee{

    String name;
    String lastName;

    int id;
    int workHour;
    int hireYear;
    double salary;

    public int getID()
    {
        return this.id;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        salaryTransactions<Double> Obj = new salaryTransactions<Double>(this.salary);
        return Obj.getAfterSalary();
    }

    public void setHireYear()
    {
        this.hireYear = hireYear;
    }

    public int getHireYear()
    {
        return this.hireYear;
    }

    public void setWorkHour(int workHour)
    {
        this.workHour = workHour;
    }

    public int getWorkHour()
    {
        return this.workHour;
    }
}