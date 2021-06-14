/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class HelloPerson {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + " nice to meet you!");
        scanner.close();
    }
}

