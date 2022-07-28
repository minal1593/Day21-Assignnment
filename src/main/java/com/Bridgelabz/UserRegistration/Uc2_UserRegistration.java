package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc2_UserRegistration {
    static String lastName= "[A-Z][a-z]{2,}";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid Last Name");
        String testName = scan.nextLine();
        if(testName.matches(lastName))
        {
            System.out.println("This is valid Last Name ");

        }
        else {
            System.out.println("Not valid ");
        }
    }
}
