/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class CarIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String silent = scanner.nextLine().toLowerCase();
        if (silent.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String corroded = scanner.nextLine().toLowerCase();
            if(corroded.equals("y")){
                System.out.print("Clean terminals and try starting again.");
            } else {
                System.out.print("Replace cables and try again.");
            }
        } else {
            System.out.print("Does the car make a slicking noise?");
            String slicking = scanner.nextLine().toLowerCase();
            if(slicking.equals("y")){
                System.out.print("Replace the battery.");
            } else {
                System.out.print("Does the car crank up but fail to start?");
                String crank = scanner.nextLine().toLowerCase();
                if(crank.equals("y")) {
                    System.out.print("Check spark plug connections.");
                } else{
                    System.out.print("Does the engine start and then die?");
                    String dies = scanner.nextLine().toLowerCase();
                    if(dies.equals("y")){
                        System.out.print("Does you car have fuel injection?");
                        String injection = scanner.nextLine().toLowerCase();
                        if(injection.equals("y")){
                            System.out.print("Get it in for service.");
                        } else {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.print("This should not be possible");
                    }
                }
            }
        }
    }
}

