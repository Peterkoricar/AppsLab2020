package com.appslab;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {4,5,1,7,2,8,3};
        System.out.println(oddEven(arrayOfIntegers));
    }

    public static int oddEven(int[] array)
    {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < array.length; i++){
             if(array[i] % 2 == 0)
                 even+= array[i];
             else
                 odd+= array[i];
        }
        System.out.println(odd);
        System.out.println(even);

        return odd - even;
    }
}