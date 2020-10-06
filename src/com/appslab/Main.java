package com.appslab;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name("Jozko") + " - Surname: " + person.surname("Mrkvicka") + " - Date of birth: " + person.dateOfBirth("4.7.1990") + " - Job position " + person.jobPosition());
    }
}
