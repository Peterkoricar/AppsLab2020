package com.appslab;



public class Person {
    private String name;
    private int age;
    private int badget;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", badget=" + badget +
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

    public int getBadget() {
        return badget;
    }

    public void setBadget(int badget) {
        this.badget = badget;
    }

    public Person(){

    }
    public Person(String name, int age, int badget)
    {
        this.name = name;
        this.age = age;
        this.badget = badget;
    }


}
