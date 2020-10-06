package com.appslab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        People john = new People("John", 19, 556);
        People sam = new People("Sam", 22, 600);

        int sum = 0;
        ArrayList<People> peopleList = new ArrayList<People>();
        peopleList.add(sam);
        peopleList.add(john);
        for(People person : peopleList)
        {
            sum += person.getBadget();
        }

        System.out.println(john);
        System.out.println(sam);
        System.out.println(sum);
    }
}
