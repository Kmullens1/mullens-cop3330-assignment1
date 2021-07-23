/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex21;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        //Numbers to Names
        /*Many programs display information to the end user in one form
        but use a different form inside the program. For example, you may
        show the word Blue on the screen, but behind the scenes you’ll
        have a numerical value for that color or an internal value because
        you may need to represent the textual description in another language
        for Spanish-speaking visitors. Write a program that converts a number
        from 1 to 12 to the corresponding month. Prompt for a number and
        display the corresponding calendar month, with 1 being January and 12
        being December. For any value outside that range, display an
        appropriate error message.

        Example Output
        Please enter the number of the month: 3
        The name of the month is March.

        Constraints
        Use a switch or case statement for this program.
        Use a single output statement for this program.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        String month = input.next();

        System.out.print("The name of the month is " + "."); //FIXME - add in the month to the sentence

    }
}