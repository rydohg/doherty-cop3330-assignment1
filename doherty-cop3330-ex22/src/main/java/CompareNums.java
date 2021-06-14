/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class CompareNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNum;

        System.out.print("Enter the first number: ");
        String num1String = scanner.nextLine();
        int num1 = Integer.parseInt(num1String);
        largestNum = num1;

        System.out.print("Enter the second number: ");
        String num2String = scanner.nextLine();
        int num2 = Integer.parseInt(num2String);

        largestNum = num2 > largestNum ? num2 : largestNum;
        System.out.print("Enter the third number: ");
        String num3String = scanner.nextLine();
        int num3 = Integer.parseInt(num3String);
        largestNum = num3 > largestNum ? num3 : largestNum;

        if (num1 == num2 || num2 == num3 || num1 == num3){
            System.out.println("Please enter unique numbers");
            System.exit(1);
        }
        System.out.println("The largest number is " + largestNum);
    }
}

