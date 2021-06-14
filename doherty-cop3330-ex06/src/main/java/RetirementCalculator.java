/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.print("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        int currentAge = scanner.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirementAge = scanner.nextInt();
        scanner.close();

        if (currentAge >= retirementAge){
            System.out.println("You can already retire!");
            System.exit(0);
        }

        System.out.println(
                "You have " + (retirementAge - currentAge) + " years until you can retire.\n" +
                "It's " + currentYear + ", so you can retire in " + (currentYear + (retirementAge - currentAge))
                );
    }
}

