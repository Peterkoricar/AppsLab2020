package com.appslab;

public class Triangle {


    int s;
    private double area;
    private double perimeter;
    private int a;
    private int b;
    private int c;
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Perimeter(){
        this.perimeter = a+ b +c;
        s += perimeter / 2;
        return perimeter;
    }

    public double Area(){
        this.area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        return area;
    }



}
