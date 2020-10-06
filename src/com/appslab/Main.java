package com.appslab;

import javax.swing.plaf.basic.BasicTreeUI;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.Perimeter());
        System.out.println(triangle.Area());
    }
}
