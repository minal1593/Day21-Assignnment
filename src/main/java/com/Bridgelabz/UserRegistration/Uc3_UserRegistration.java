package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc3_UserRegistration {
    static String Email= "[a-z]+[./+_]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.][a-z]{2}?";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid email");
        String testName = scan.nextLine();
        if(testName.matches(Email))
        {
            System.out.println("This is valid email");

        }
        else {
            System.out.println("Not valid email");
        }
    }
}