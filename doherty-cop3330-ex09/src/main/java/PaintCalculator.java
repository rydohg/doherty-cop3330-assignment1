/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Room shape (R for rectangle, C for circular): ");
        String shape = scanner.next();

        double area = 0;
        switch (shape) {
            case "R" -> {
                System.out.print("Length: ");
                int length = scanner.nextInt();
                System.out.print("Width: ");
                int width = scanner.nextInt();
                area = length * width;
            }
            case "C" -> {
                System.out.print("Radius: ");
                int radius = scanner.nextInt();
                area = Math.PI * radius * radius;
            }
        }

        System.out.println("You will need to purchase " + (int) (Math.ceil(area/350)) + " gallon of paint to cover " + area + " square feet");
        scanner.close();
    }
}

