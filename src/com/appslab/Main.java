package com.appslab;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(oddEven());
    }

    public static int oddEven() {
        var odds = new ArrayList<Integer>();
        var even = new ArrayList<Integer>();
        int number = 0;
        int oddsC = 0;
        int evenC = 0;
        for (int i = 0; i < 5; i++) {
            number++;
            if (number % 2 == 0) {
                even.add(number);
                evenC += number;
            } else {
                odds.add(number);
                oddsC += number;
            }
        }
        return evenC - oddsC;
    }
}