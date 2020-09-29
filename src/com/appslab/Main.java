package com.appslab;

public class Main {
    public static void main(String[] args) {
        System.out.println(RPS("paper", "rock"));
    }

    public static String RPS(String p1, String p2) {
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        if (p1 == rock && p2 == scissors || p1 == scissors && p2 == paper || p1 == paper && p2 == rock)
            return "Player 1 wins";
        else
            return "Player 2 wins";
    }
}