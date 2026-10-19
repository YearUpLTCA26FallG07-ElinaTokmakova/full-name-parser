package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name (ex. Dana L. Wyatt): ");
        String fullName = myScanner.nextLine();

        fullName = fullName.trim();

        String[] names = fullName.split("\\ ");

        String firstName;
        String middleName;
        String lastName;
        int count = names.length;

        if (count == 3) {
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
        } else {
            firstName = names[0];
            middleName = "(none)";
            lastName = names[1];
        }

        System.out.println("\nFist name: " + firstName +
                "\nMiddle name: " + middleName +
                "\nLast name: " + lastName);
    }
}
