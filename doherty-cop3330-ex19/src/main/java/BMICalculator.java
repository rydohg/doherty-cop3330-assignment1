/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your height in inches: ");
            int height = scanner.nextInt();
            System.out.print("Enter your weight in pounds: ");
            int weight = scanner.nextInt();
            double bmi = ((double) weight / (height * height)) * 703;
            System.out.println("Your BMI is " + bmi);
            if (bmi > 18.5 && bmi < 25){
                System.out.println("You are within the ideal weight range");
            } else {
                System.out.println(bmi < 18.5 ? "You are underweight. You should see your doctor" : "You are overweight. You should see your doctor");
            }
        } catch (InputMismatchException e){
            System.out.println("Please only enter numbers into the calculator.");
            System.exit(1);
        }
    }
}

