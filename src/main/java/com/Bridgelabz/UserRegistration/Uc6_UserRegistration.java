package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc6_UserRegistration {
    static String Password= "[A-Z+a-z\\d@$!%*?&]{8,}";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid Password(Should have at least one Upper case) ");
        String testName = scan.nextLine();
        if(testName.matches(Password))
        {
            System.out.println("This is valid Password ");

        }
        else {
            System.out.println("Not valid ");
        }
    }
}
