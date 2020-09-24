package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(totalDistance(0.50, 5.00, 50.00));
    }

    public static double totalDistance(double heigh, double length, double towerheigh) {
        return ((towerheigh / heigh) * (length + heigh));
    }
}