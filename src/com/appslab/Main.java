package com.appslab;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        var a = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++) {
            a.add(1);
            a.add(2);
        }
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(5);
        AL(a);
        addIf(6, a);
        minusEven(a);
    }

    public static void AL(ArrayList<Integer> returnik) {
        if (returnik.isEmpty())
            System.out.println("List is empty.");
        else
            returnik.forEach(n -> System.out.print(n + " "));
    }

    public static void addIf(int f, ArrayList<Integer> returnik) {
        System.out.println(); //aby písalo na ďalší riadok
        System.out.println("You are trying to add number " + f + " to the list.");
        if (returnik.contains(f))
            System.out.println("Oops, list already contains " + f);
        else {
            returnik.add(f);
            System.out.println("You had successfully added number " + f + "to the list.");
        }
    }

    public static void minusEven(ArrayList<Integer> returnik)
    {
        System.out.println("You are trying to remove even numbers from the list");
            returnik.removeIf(n-> n%2 == 0);
            System.out.println("New form of the list is " + returnik + ".");
    }
}
