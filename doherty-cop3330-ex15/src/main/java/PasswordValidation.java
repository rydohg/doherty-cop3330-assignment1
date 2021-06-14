/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the password? ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals("abc$123")){
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}

