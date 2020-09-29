package com.appslab;



public class Main {
    public static void main(String[] args) {
        System.out.println(isTriangle(12,1,1));
    }
    public static Boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
}