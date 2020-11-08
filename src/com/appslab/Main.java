package com.appslab;

import java.util.stream.*;
import java.util.Collections;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        Person john = new Person("John", 19, 556);
        Person steve = new Person("Steve", 22, 600);
        Person martin = new Person("Martin", 25, 1300);
        var b = new ArrayList<Integer>();
        var a = new ArrayList<Integer>();
        Collections.addAll(a,1,1,1,2,2,3,4,5);
        Collections.addAll(b,1,1,1,2,2,3,4,5);
        var people = new ArrayList<Person>();
        Collections.addAll(people, john,steve,martin);
        AL(a);
        addIf(6, a);
        minusEven(a);
        System.out.println(evenBack(b));
        System.out.println(multiplyByLength(a));
        sumBadget(people);
        System.out.println(containsA(people));

        }

    public static void AL(ArrayList<Integer> returnik) {
        if (returnik.isEmpty())
            System.out.println("List is empty.");
        else
            returnik.forEach(n -> System.out.print(n + " "));
    }
    public static void addIf(int f, ArrayList<Integer> returnik) {
        System.out.println(); //aby písalo na ďalší riadok
        if(!returnik.contains(f)){
            returnik.add(f);
        }
    }

    public static void minusEven(ArrayList<Integer> returnik) {
        returnik.removeIf(n-> n%2 == 0);
        System.out.println(returnik);

    }

    public static ArrayList<Integer> evenBack(ArrayList<Integer> returnik){
        return returnik.stream().filter(n -> n%2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> multiplyByLength(ArrayList<Integer> returnik){
        return returnik.stream().map(n -> n*returnik.size()).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void sumBadget(ArrayList<Person> peoplelist){
        System.out.println(peoplelist.stream().mapToInt(person -> person.getBadget()).sum());
    }

    public static boolean containsA(ArrayList<Person> peoplelist){
       return peoplelist.stream().anyMatch(person -> person.getName().contains("a"));
    }
}


