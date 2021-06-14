/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BACCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            int gender = scanner.nextInt();
            System.out.print("How many ounces of alcohol did you have? ");
            int ounces = scanner.nextInt();
            System.out.print("What is your weight, in pounds? ");
            int pounds = scanner.nextInt();
            System.out.print("How many hours has it been since your last drink? ");
            int hours = scanner.nextInt();

            double bac = ounces * 5.14 / pounds * (gender == 1 ? .73 : .66) - .015 * hours;
            System.out.println("Your BAC is " + bac + "\n" + (bac > .08 ? "It is not legal for you to drive." : "It is legal for you to drive."));
        } catch (InputMismatchException e){
            System.out.println("If you can't enter numbers when asked you're too drunk to drive");
            System.exit(1);
        }
    }
}

