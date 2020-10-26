package com.appslab;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args)
    {
        var a = new ArrayList<Integer>();
        for(int i = 0; i < 2; i++) {
            a.add(1);
            a.add(2);
        }
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(5);
        AL(a);
        addIf(1,a);
    }
    public static void AL (ArrayList<Integer> returnik ){
        if(returnik.isEmpty())
            System.out.println("List is empty");
        else
            returnik.forEach(n -> System.out.println(n));
    }
    public static void addIf(int f, ArrayList<Integer> returnik){
        System.out.println("You are trying to add number " + f + " to the list.");
        if(returnik.contains(f))
            System.out.println("Oops, list already contains " + f);
        else {
            returnik.add(f);
            returnik.forEach(n -> System.out.println("You had successfully added number " + n + "to the list"));
        }
    }
}
