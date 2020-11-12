package com.appslab;

public class Teacher extends Job {
    public Teacher(float salary, int bonus){
        super(salary, bonus);
        jobname = JobType.TEACHER;
    }
}
