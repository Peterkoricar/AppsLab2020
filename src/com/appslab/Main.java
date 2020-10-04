package com.appslab;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(Multiply());
    }

    public static int Multiply() {
        int a = 0;
        int b = 0;
        int g = 0;
        var numbers = new ArrayList<Integer>();
        var rund = new Random();
        var rand = new Random();
        g = rund.nextInt(25);
        for (int c = 0; c < g; c++) {
            numbers.add(rand.nextInt(25));
            b = numbers.size();
        }
        for(int i = 0; i < b; i++)
            a = numbers.get(i);
        System.out.println(a);
        System.out.println(b);
        return a * b;
    }
}