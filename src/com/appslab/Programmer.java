package com.appslab;

public class Programmer {
    private float salary;
    private int bonus;

    public Programmer(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public String getInfo(){
        return ("Programmer's salarry is " + salary + " and bonus is " + bonus);
    }
}
