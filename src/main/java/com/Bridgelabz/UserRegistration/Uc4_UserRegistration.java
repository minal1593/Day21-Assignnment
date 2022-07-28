package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc4_UserRegistration {
    static String MobileFormat= "\\d{2,3}\\s\\d{10}";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid Mobile Number");
        String testName = scan.nextLine();
        if(testName.matches( MobileFormat))
        {
            System.out.println("This is valid Mobile Number");

        }
        else {
            System.out.println("Not valid Mobile Number");
        }
    }
}