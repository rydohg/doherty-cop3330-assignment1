/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 < 0 || num2 < 0){
            System.out.println("Please only enter positive numbers");
            System.exit(1);
        }

        System.out.println(
                num1 + " + " + num2 + " = " + (num1 + num2) + "\n" +
                num1 + " - " + num2 + " = " + (num1 - num2) + "\n" +
                num1 + " * " + num2 + " = " + (num1 * num2) + "\n" +
                num1 + " / " + num2 + " = " + (num1 / num2) + "\n"
        );
    }
}

