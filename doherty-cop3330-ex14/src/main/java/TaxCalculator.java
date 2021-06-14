/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String amountString = scanner.nextLine();
        double amount = Double.parseDouble(amountString);

        System.out.print("What is the state? ");
        String state = scanner.nextLine();
        scanner.close();

        if (state.equals("WI")){
            System.out.printf("Subtotal: $%.2f\n", amount);
            System.out.printf("Tax: $%.2f\n", (amount + amount * .055));
            amount = amount + amount * .055;
        }
        System.out.printf("Total: $%.2f\n", amount);
    }
}

