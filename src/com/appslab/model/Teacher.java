package com.appslab.model;

import com.appslab.main.EmployeeService;

public class Teacher extends Job {
    public Teacher(float salary, int bonus){
        super(salary, bonus, JobType.TEACHER);

    }
}
