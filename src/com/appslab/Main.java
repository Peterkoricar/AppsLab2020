package com.appslab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static int sum() {
        var rand = new Random();
        var arList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            arList.add(rand.nextInt());
        System.out.println(Collections.max(arList));
        System.out.println(Collections.min(arList));
        return (Collections.max(arList) - Collections.min(arList));
    }
}