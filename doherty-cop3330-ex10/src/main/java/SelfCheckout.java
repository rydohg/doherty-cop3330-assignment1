/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subTotal = 0;
        for (int i = 0; i < 3; i++){
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity of item " + i + ": ");
            int quantity = scanner.nextInt();
            subTotal += price * quantity;
        }
        scanner.close();

        double tax = subTotal * .055;
        double total = subTotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subTotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}

