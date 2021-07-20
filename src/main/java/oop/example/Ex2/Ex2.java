/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Counting the Number of Characters
        /*Create a program that prompts for an input string and displays output
        that shows the input string and the number of characters the string contains.
        Example Output
            What is the input string? Homer
            Homer has 5 characters.
        Constraints
            Be sure the output contains the original string.
            Use a single output statement to construct the output.
            Use a built-in function of the programming language to determine the length of the string.*/

        System.out.print("What is the input string? ");

        Scanner input = new Scanner(System.in);
        String inputString = input.next();

        System.out.println(inputString + " has " + inputString.length() + " characters.");
    }
}
