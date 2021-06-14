/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        System.out.print("How many people? ");
        Scanner scanner = new Scanner(System.in);
        int numPeople = scanner.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numPizzas = scanner.nextInt();

        System.out.print("How many slices per pizza? ");
        int numSlices = scanner.nextInt();
        scanner.close();

        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + (numPizzas * numSlices) + ")");
        double exactSlicesPerPerson = (numPizzas * numSlices) / ((double) numPeople);
        int slicesPerPerson = (int) Math.floor(exactSlicesPerPerson);
        int remainingSlices = (numPizzas * numSlices) % numPeople;
        System.out.print("Each person gets " + slicesPerPerson);
        if (slicesPerPerson > 1){
            System.out.print(" slices ");
        } else {
            System.out.print(" slice ");
        }
        System.out.println("of pizza");
        System.out.println("There are " + remainingSlices + " leftover pieces.");
    }
}

