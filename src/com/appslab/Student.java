package com.appslab;


public class Student
{
    private String name;
    private  int number;
    private String phoneNumber;
    private String adress;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", PhoneNumber=" + phoneNumber +
                ", Adress=" + adress +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Student() {

    }

    public Student(String name, int number, String phoneNumber, String adress)
    {
        this.name = name;
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }
}
