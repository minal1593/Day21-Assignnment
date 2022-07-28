package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc1_UserRegistration {
    static String firstName= "[A-Z]{1}[a-z]{2,}";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid First Name");
        String testName = scan.nextLine();
        if(testName.matches(firstName))
        {
            System.out.println("This is valid ");

        }
        else {
            System.out.println("Not valid ");
        }
    }
}
