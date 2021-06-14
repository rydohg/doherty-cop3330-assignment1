/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        final double IMPERIAL_TO_METRIC = 0.09290304;

        System.out.print("What is the length of the room? ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.print("What is the width of the room? ");
        int width = scanner.nextInt();
        scanner.close();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        int imperialArea = length * width;
        double metricArea = imperialArea * IMPERIAL_TO_METRIC;

        System.out.println("The area is\n" + imperialArea + " square feet\n" + metricArea + " square meters");
    }
}

