/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter C to convert from Fahrenheit to Celsius.\nEnter F to convert from Celsius to Fahrenheit.\nYour Choice: ");
        String choiceInputString = scanner.nextLine().toUpperCase();

        String convertFrom = "Celsius";
        String convertTo = "Fahrenheit";
        if (choiceInputString.equals("C")){
            convertFrom = "Fahrenheit";
            convertTo = "Celsius";
        }
        System.out.print("Enter the temperature in " + convertFrom + ": ");
        int originalTemp = scanner.nextInt();

        double newTemperature = 0;
        if(choiceInputString.equals("F")){
            newTemperature = originalTemp * 9.0/5 + 32;
        } else if (choiceInputString.equals("C")){
            newTemperature = (originalTemp - 32) * 5.0/9;
        }
        System.out.println("The temperature in " + convertTo + " is " + newTemperature);
    }
}

