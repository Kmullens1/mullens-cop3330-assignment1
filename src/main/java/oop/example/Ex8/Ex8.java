/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex8;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        //Pizza Party
        /*Division isn’t always exact, and sometimes you’ll write programs
        that will need to deal with the leftovers as a whole number instead
        of a decimal. Write a program to evenly divide pizzas. Prompt for the
        number of people, the number of pizzas, and the number of slices per
        pizza. Ensure that the number of pieces comes out even. Display the
        number of pieces of pizza each person should get. If there are
        leftovers, show the number of leftover pieces.

        Example Output:
        How many people? 8
        How many pizzas do you have? 2
        How many slices per pizza? 8
        8 people with 2 pizzas (16 slices)
        Each person gets 2 pieces of pizza.
        There are 0 leftover pieces.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int numOfPeople = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numOfPizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = input.nextInt();

        int numOfSlices = numOfPizzas * slicesPerPizza;

        System.out.print(numOfPeople + " people with " + numOfPizzas + " pizzas (" + numOfSlices + " slices)\n");

        int slicesPerPerson = numOfSlices / numOfPeople;
        int remainder = numOfSlices % numOfPeople;
        System.out.print("Each person gets " + slicesPerPerson + " pieces of pizza.\n");
        System.out.print("There are " + remainder + " leftover pieces.");

    }
}