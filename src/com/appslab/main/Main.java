package com.appslab.main;

import com.appslab.model.Driver;
import com.appslab.model.Job;
import com.appslab.model.Programmer;
import com.appslab.model.Teacher;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Job> list = new ArrayList<>();
        Teacher teacher = new Teacher(900,300);
        Programmer programmer = new Programmer(1700, 200);
        Driver driver = new Driver(600, 350);
        Collections.addAll(list, teacher, programmer, driver);
        list.forEach(n -> System.out.println(n.getInfo()));
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        employee.totalBonus(list);
        employee.totalSalary(list);

    }
}
