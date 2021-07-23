/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10 {
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
        double price1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        double quantity1 = input.nextDouble();

        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        double quantity2 = input.nextDouble();

        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        double quantity3 = input.nextDouble();

        //Math operations and String building
        double subtotal = (price1 * quantity1) + (price2 + quantity2) + (price3 * quantity3);

        DecimalFormat df = new DecimalFormat("###.##");
        String printSubtotal = "Subtotal: $" + df.format(subtotal) + "\n";
        String printTax = "Tax: $" + "\n";
        String printTotal = "Total: $";


        //Printing out the output
        System.out.print(printSubtotal);
        System.out.print(printTax);
        System.out.print(printTotal);


        //FIXME // Fix decimal places to 2
        //FIXME Finish Tax and Total Calculations
    }
}
