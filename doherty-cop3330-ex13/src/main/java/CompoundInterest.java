/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the interest rate: ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("How many times is this compounded per year: ");
        int timesCompounded = scanner.nextInt();
        scanner.close();

        double initialReturn = (1 + rate/timesCompounded);
        double returnOnInvestment = (1 + rate/timesCompounded);
        for(int i = 1; i < years*timesCompounded; i++){
            returnOnInvestment = returnOnInvestment * initialReturn;
        }
        returnOnInvestment = returnOnInvestment * principal;
        System.out.printf("%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, rate * 100, years, timesCompounded, returnOnInvestment);
    }
}

