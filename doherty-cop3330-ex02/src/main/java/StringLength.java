/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if (inputString.length() != 0){
            System.out.println(inputString + " has " + inputString.length() + " characters");
        } else {
            System.out.println("Please enter something genius");
        }
        scanner.close();
    }
}

