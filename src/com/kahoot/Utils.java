package com.kahoot;

import java.util.Scanner;

public class Utils {

    public static int requestInput(int minimum, int maximum) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= minimum && input <= maximum) {
                    isValidInput = true;
                } else {
                    System.err.print("That is not a valid option! ");
                }
            } catch (NumberFormatException e) {
                System.err.print("That is not a number! ");
            }
        }
        return input;
    }
}
