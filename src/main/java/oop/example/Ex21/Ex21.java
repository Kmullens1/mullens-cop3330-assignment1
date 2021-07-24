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
        int monthNum = input.nextInt();
        String monthAlpha;

        switch(monthNum) {
            case 1:
                monthAlpha = "January";
                break;

            case 2:
                monthAlpha = "February";
                break;

            case 3:
                monthAlpha = "March";
                break;

            case 4:
                monthAlpha = "April";
                break;

            case 5:
                monthAlpha = "May";
                break;

            case 6:
                monthAlpha = "June";
                break;

            case 7:
                monthAlpha = "July";
                break;

            case 8:
                monthAlpha = "August";
                break;

            case 9:
                monthAlpha = "September";
                break;

            case 10:
                monthAlpha = "October";
                break;

            case 11:
                monthAlpha = "November";
                break;

            case 12:
                monthAlpha = "December";
                break;

            default :
                monthAlpha = "ERROR";
        }

        System.out.print("The name of the month is " + monthAlpha + ".");

    }
}