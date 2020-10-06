package com.appslab;

public class Person {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String jobPosition;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public String name (String name){
        this.name = name;
        return name;
    }
    public  String surname(String surname){
        this.surname = surname;
        return surname;
    }
    public String dateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return dateOfBirth;
    }
    public String jobPosition(){
        Job jobPosition = new Job();
        this.jobPosition = jobPosition.toString();
        return jobPosition.name("IT programmer") + jobPosition.salary(" - 2100€");
    }
}
