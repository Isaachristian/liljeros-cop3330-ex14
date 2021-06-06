/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Tax Calculator
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double amount;
        String state;

        System.out.print("What is the order amount? ");
        amount = Double.parseDouble(scanner.nextLine());

        System.out.print("What is the State? ");
        state = scanner.nextLine();

        if (state.equals("WI")) {
            double tax = amount * 5.5 / 100;
            System.out.printf("The subtotal is $%.2f%n", amount);
            System.out.printf("The tax is $%.2f%n", tax);
            amount += tax;
        }

        System.out.printf("The total is $%.2f", amount);
    }
}
