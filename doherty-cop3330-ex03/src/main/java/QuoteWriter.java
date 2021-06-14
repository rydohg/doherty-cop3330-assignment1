/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class QuoteWriter {
    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.print("Who said it? ");
        String name = scanner.nextLine();
        System.out.println(name + " says, \"" + quote + "\"");
        scanner.close();
    }
}

