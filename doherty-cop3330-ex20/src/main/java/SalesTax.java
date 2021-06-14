/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the order amount: ");
        String amountString = scanner.nextLine();
        int amount = Integer.parseInt(amountString);
        System.out.print("Enter your state: ");
        String state = scanner.nextLine();

        double tax = 0;
        if (state.equals("Wisconsin")) {
            tax = 0.05;
            System.out.print("Enter your county: ");
            String county = scanner.nextLine();
            if (county.equals("Eau Claire")){
                tax += .005;
            } else if(county.equals("Dunn")){
                tax += .004;
            }
        } else if (state.equals("Illinois")){
            tax = 0.08;
        }
        if (tax != 0){
            System.out.printf("Tax: $%.2f\n", amount * tax);
        }
        System.out.printf("Total: $%.2f\n", amount + amount * tax);
    }
}

