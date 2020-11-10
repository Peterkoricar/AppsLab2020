package com.appslab;



public class Person {
    private String name;
    private int age;
    private int budget;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Person(){

    }
    public Person(String name, int age, int budget)
    {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }


}
