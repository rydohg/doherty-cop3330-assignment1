/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the interest rate: ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        scanner.close();

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f", years, rate * 100, (principal*(1+rate*years)));
    }
}

