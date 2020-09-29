package com.appslab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static int sum() {
        var rand = new Random();
        var arList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            arList.add(rand.nextInt());
        System.out.println(Collections.max(arList).byteValue());
        System.out.println(Collections.min(arList).byteValue());
        return (Collections.max(arList).byteValue() - Collections.min(arList).byteValue());
    }
}