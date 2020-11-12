package com.appslab;

public class Teacher {
    private float salary;
    private int bonus;

    public Teacher(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getInfo(){
        return ("Teacher's salarry is " + salary + " and bonus is " + bonus);
    }
}
