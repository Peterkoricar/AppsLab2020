package com.appslab;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Job> list = new ArrayList<>();
        Teacher teacher = new Teacher(900,300);
        Programmer programmer = new Programmer(1700, 200);
        Driver driver = new Driver(600, 350);
        Collections.addAll(list, teacher, programmer, driver);
        list.forEach(n -> System.out.println(n.getInfo()));

    }
}
