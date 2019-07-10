package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String answer;
        int number;
        System.out.println("Fibonacci series of 20 numbers: ");
        System.out.print("0 1 ");
        new RecursiveTesting().Fibo(18);
        do {
            System.out.println("\nType in a number:");
            number = new Scanner(System.in).nextInt();
            new RecursiveTesting().Collatz(number);
            System.out.println("Do you want to continue? If yes, press any key. Otherwise, press Q to quit");
            answer = new Scanner(System.in).nextLine();
        } while (!answer.equalsIgnoreCase("q"));
    }
}
