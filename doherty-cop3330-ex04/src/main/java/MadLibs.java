/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("I " + verb + "ed the " + adjective + " " + noun + " " + adverb);
        scanner.close();
    }
}

