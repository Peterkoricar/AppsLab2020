package com.appslab;

public class Programmer extends Job {

    public Programmer (float salary, int bonus){
        super(salary, bonus);
        jobname = JobType.PROGRAMMER;
    }
}
