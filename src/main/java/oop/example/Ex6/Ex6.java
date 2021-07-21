/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */


//////////////////////////////////////////////////////////
////////INCOMPLETE////////////////////////////////////////
//////////////////////////////////////////////////////////


package oop.example.Ex6;

import java.util.Scanner;
import java.time.LocalDate;

public class Ex6 {
    public static void main(String[] args) {
        //Retirement Calculator
        /*Your computer knows what the current year is, which means you can incorporate
        that into your programs. You just have to figure out how your programming language
        can provide you with that information. Create a program that determines how many
        years you have left until retirement and the year you can retire. It should prompt
        for your current age and the age you want to retire and display the output as shown
        in the example that follows.
        Example Output
            What is your current age? 25
            At what age would you like to retire? 65
            You have 40 years left until you can retire.
            It's 2015, so you can retire in 2055.
        Constraints
            Again, be sure to convert the input to numerical data before doing any math.
            Don’t hard-code the current year into your program. Get it from the system time
            via your programming language.*/

        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String current = input.next();

        System.out.print("At what age would you like to retire?");
        String retire = input.next();

        int ageNow = Integer.parseInt(current);
        int ageThen = Integer.parseInt(retire);

        int numOfYears = ageThen - ageNow;

        int yearNow = getYear();

        System.out.println("You have " + numOfYears + " years left until you can retire.");
        System.out.println("It's " + ", so you can retire in " + "."); ////
    }
}

