package com.appslab;

public class Main {
    public static void main(String[] args) {
        System.out.println(Slices(10,5,3));
    }
    public static boolean Slices(int slices, int people, int pSlices)
    {
        return slices >= people * pSlices;
    }
}