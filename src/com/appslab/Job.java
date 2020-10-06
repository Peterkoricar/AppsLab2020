package com.appslab;

public class Job {
    private String name;
    private String salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String name(String name){
        this.name = name;
        return name;
    }
    public String salary(String salary){
        this.salary = salary;
        return salary;
    }
}

