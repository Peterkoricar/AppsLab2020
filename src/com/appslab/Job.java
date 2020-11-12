package com.appslab;

public class Job {
    protected float salary;
    protected int bonus;
    protected JobType jobname;

    public Job(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public String getInfo(){
        return (jobname.getName() + " has a sallary: " + salary + " and a bonus: " + bonus);
    }
}
