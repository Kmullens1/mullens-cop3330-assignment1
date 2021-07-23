/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10 {

    static final double TAX_RATE = 0.055;

    public static void main(String[] args) {
        //Self-Checkout
        /*Working with multiple inputs and currency can introduce some
        tricky precision issues. Create a simple self-checkout system.
        Prompt for the prices and quantities of three items. Calculate
        the subtotal of the items. Then calculate the tax using a tax
        rate of 5.5%. Print out the line items with the quantity and
        total, and then print out the subtotal, tax amount, and total.

        Example Output
        Enter the price of item 1: 25
        Enter the quantity of item 1: 2
        Enter the price of item 2: 10
        Enter the quantity of item 2: 1
        Enter the price of item 3: 4
        Enter the quantity of item 3: 1
        Subtotal: $64.00
        Tax: $3.52
        Total: $67.52

        Constraints
        Keep the input, processing, and output parts of your program
        separate. Collect the input, then do the math operations and
        string building, and then print out the output.
        Be sure you explicitly convert input to numerical data before
        doing any calculations.
         */
        //Could use a 'for' loop to reduce redundancy, but that's unnecessarily complicated for this example.

        //Collecting Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String p1 = input.next();
        System.out.print("Enter the quantity of item 1: ");
        String q1 = input.next();

        System.out.print("Enter the price of item 2: ");
        String p2 = input.next();
        System.out.print("Enter the quantity of item 2: ");
        String q2 = input.next();

        System.out.print("Enter the price of item 3: ");
        String p3 = input.next();
        System.out.print("Enter the quantity of item 3: ");
        String q3 = input.next();

        //Be sure you explicitly convert input to numerical data before doing any calculations.
        //(Weird way to do it, but okay...)
        int price1 = Integer.parseInt(p1);
        int quantity1 = Integer.parseInt(q1);
        int price2 = Integer.parseInt(p2);
        int quantity2 = Integer.parseInt(q2);
        int price3 = Integer.parseInt(p3);
        int quantity3 = Integer.parseInt(q3);

        //Math operations and String building
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        String roundedSubtotal = String.format("%.2f", subtotal);
        String printSubtotal = "Subtotal: $" + roundedSubtotal + "\n";

        double tax = subtotal * TAX_RATE;
        String printTax = "Tax: $" + tax + "\n";

        double total = subtotal + tax;
        String printTotal = "Total: $" + total;


        //Printing out the output
        System.out.print(printSubtotal);
        System.out.print(printTax);
        System.out.print(printTotal);

    }
}
