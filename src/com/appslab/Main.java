package com.appslab;

import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args)
    {

        System.out.println(rooks());
    }
    public static Boolean rooks()
    {
        var numbers = new ArrayList<Integer>();
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        for (int i = 0; i < letters.length - 1; i++)
            numbers.add(i);

        var rand = new Random();
        int a = rand.nextInt(letters.length - 1);
        int b = rand.nextInt(letters.length - 1);

        var number1 = numbers.get(a);
        var number2 = numbers.get(b);

        while (letters[a] == letters[b] && number1 == number2)
        {
            a = rand.nextInt(letters.length - 1);
        }
        String r1 = letters[a] + number2;
        String r2 = letters[b] + number1;

        System.out.println(r1);
        System.out.println(r2);
        return (a == b|| number1.equals(number2));
    }
}
