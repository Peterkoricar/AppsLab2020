package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(endings("mama", "ma"));
    }
    public static Boolean endings(String a , String b)
    {
        int t = 0;
        int z = 0;
        for (int i = a.length() -1; i > 0; i--)
        {
            for(int n = b.length() - 1; n > 0; n--)
            {
                t = i;
                z = n;
                return a.charAt(i) == b.charAt(n);
            }
        }
        return  a.charAt(t) == b.charAt(z);
    }
}
