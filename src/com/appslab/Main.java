package com.appslab;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(900,300);
        Programmer programmer = new Programmer(1700, 200);
        System.out.println(teacher1.getInfo() + " " + programmer.getInfo());
    }
}
