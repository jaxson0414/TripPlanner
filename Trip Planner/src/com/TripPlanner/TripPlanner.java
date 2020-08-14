package com.TripPlanner;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Greeting();
        TravelTimeAndBudget();
        TimeDifference();
        CountryArea();
    }

    public static void Greeting () {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Nice to meet you " + name + ", " + "where are you travelling to? ");
        String destination = input.next();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("**********");
        System.out.println();
        System.out.println();
    }

    public static void TravelTimeAndBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days you are going to spent travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String letter = input.next();
        System.out.print("How many " + letter + " are these in 1 USD? ");
        double rate = input.nextDouble();
        System.out.println();
        System.out.println();
        int x = days;
        int y = 24;
        int z = 60;
        int a = money;
        double b = rate;
        System.out.println("If you are travelling for " + days + " days that is the same as " + (x * y) + " hours" + " or " + (x * y *z) +" minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + (money / days));
        System.out.println("Your total budget in " + letter + " is " + (money * rate) + ", which per day is " + (money * rate / days) + " " + letter);
        System.out.println("**********");
        System.out.println();
        System.out.println();
    }

    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int timediff = input.nextInt();
        int midnight = (24 + timediff)%24;
        int noon = (12 + timediff)%24;
        System.out.println("That means that when it is at midnight at home it will be " + midnight + ":00 in your travel destination");
        System.out.println("and when it is noon it will be " + noon + ":00" );
        System.out.println("**********");
        System.out.println();
        System.out.println();
    }
      
    public static void CountryArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        double area = input.nextDouble();
        double miles = (area / 2.59);
        System.out.println("In miles2 that is "  + miles);
        System.out.println("**********");
        System.out.println();
        System.out.println();
    }
}


