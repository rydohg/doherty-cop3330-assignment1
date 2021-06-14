/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros = scanner.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = scanner.nextDouble();
        scanner.close();

        System.out.printf("%.2f at an exchange rate of %f is\n%.2f U.S. dollars", euros, rate, euros * rate);
    }
}

