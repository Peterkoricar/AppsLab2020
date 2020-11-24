package com.appslab.main;

import com.appslab.model.Job;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public float totalSalary(List<Job> list) {
        return (float)list.stream().mapToDouble(Job::getSalary).sum();
    }

    @Override
    public int totalBonus(List<Job> list) {
        return list.stream().mapToInt(Job::getBonus).sum();
    }
}
