package com.appslab;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(Multiply(9));
    }

    public static int Multiply(int a) {
        var numbers = new ArrayList<Integer>();
        var rand = new Random();
        numbers.add(rand.nextInt(100));
        int b = numbers.size();
        for(int i = 0; i < b; i++)
            a = numbers.get(i);
        return a * b;
    }
}