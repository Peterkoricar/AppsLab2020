package com.appslab;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(palindrome("monday"));
    }
    public static String palindrome(String original)
    {
        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--)
        {
            reverse += original.charAt(i);
        }
        if(original.equals(reverse))
            return ("String is a palindrome");
        else
            return ("String is not a palindrome");
    }
}