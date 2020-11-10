package com.appslab;

import java.util.stream.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Person john = new Person("John", 19, 556);
        Person steve = new Person("Steve", 22, 600);
        Person martin = new Person("Martin", 25, 1300);
        var b = new ArrayList<Integer>();
        var a = new ArrayList<Integer>();
        var c = new HashMap<Integer, String>();
        Collections.addAll(a,1,1,1,2,2,3,4,5);
        Collections.addAll(b,1,1,1,2,2,3,4,5);
        var people = new ArrayList<Person>();
        Collections.addAll(people, john,steve,martin);
        AL(a);
        addIf(6, a);
        minusEven(a);
        System.out.println(evenBack(b));
        System.out.println(multiplyByLength(a));
        sumBudget(people);
        System.out.println(containsA(people));
        System.out.println(returnHS(b));
        returnHM();
        System.out.println(); //medzera
        addNew(1,"Red", c);
        addNew(1,"Red", c);
        System.out.println(c);
        }

    public static void AL(ArrayList<Integer> returnik) {
        if (returnik.isEmpty())
            System.out.println("List is empty.");
        else
            returnik.forEach(n -> System.out.print(n + " "));
    }
    public static void addIf(int f, ArrayList<Integer> returnik) {
        System.out.println(); //medzera
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

    public static void sumBudget(ArrayList<Person> peoplelist){
        System.out.println(peoplelist.stream().mapToInt(person -> person.getBudget()).sum());
    }

    public static boolean containsA(ArrayList<Person> peoplelist){
       return peoplelist.stream().anyMatch(person -> person.getName().contains("a"));
    }

    public static HashSet<Integer> returnHS (ArrayList<Integer> returnik){
        HashSet<Integer> hs = new HashSet<Integer>(returnik);
        hs.add(1);//V podstate nič nerobí :)
        return hs;
    }
    public static void returnHM (){
        var hm = new HashMap<Integer, String>();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Black");
        hm.put(4, "White");
        hm.forEach((n, m)-> System.out.println(n + " = " + m));
    }

    public static void addNew (int a, String key, Map<Integer, String> hm){
        hm.putIfAbsent(a, key);
    }
}


