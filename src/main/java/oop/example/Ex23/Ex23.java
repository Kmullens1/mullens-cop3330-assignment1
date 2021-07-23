/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex23;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        //Troubleshooting Car Issues
        /*An expert system is a type of artificial intelligence
        program that uses a knowledge base and a set of rules to
        perform a task that a human expert might do. Many websites
        are available that will help you self-diagnose a medical
        issue by answering a series of questions. And many hardware
        and software companies offer online troubleshooting tools to
        help people solve simple technical issues before calling a
        human. Create a program that walks the user through
        troubleshooting issues with a car. Use the following decision
        tree to build the system:

        @startuml
        if (Is the car silent when you turn the key?) then (yes)
            if (Are the battery terminals corroded?) then (yes)
                :Clean terminals and try starting again.;
                stop
            else (no)
                :Replace cables and try again.;
                stop
            endif
        else (no)
            if (Does the car make a slicking noise?) then (yes)
                :Replace the battery.;
                stop
            else (no)
                if (Does the car crank up but fail to start?) then (yes)
                    :Check spark plug connections.;
                    stop
                else (no)
                    if (Does the engine start and then die?) then (yes)
                        if (Does you car have fuel injection?) then (yes)
                            :Get it in for service.;
                            stop
                        else (no)
                            :Check to ensure the choke is opening and closing.;
                            stop
                        endif
                    else (no)
                        :This should not be possible.;
                        stop
                    endif
                endif
            endif
        endif
        @enduml

        Example Output
        Is the car silent when you turn the key? y
        Are the battery terminals corroded? n
        Replace cables and try again.

        Constraint
        Ask only questions that are relevant to the situation
        and to the previous answers. Don’t ask for all inputs at once.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.next(); //FIXME - should this be a bool, String or char?

        System.out.print("Are the battery terminals corroded? "); //FIXME - add hierarchy?

        System.out.print("Replace cables and try again."); //FIXME - add if/then statements?

    }
}
