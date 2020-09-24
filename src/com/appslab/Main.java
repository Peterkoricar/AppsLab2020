package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(numberEqual(1,8,1));
    }
    public static int numberEqual(int a, int b, int c)
    {
        int equal = 0;
        if (a == b)
            equal++;
        if (a == c)
            equal++;
        if(b == c)
            equal++;
        if (equal == 1)
            equal = 2;
        return equal;
    }
}
