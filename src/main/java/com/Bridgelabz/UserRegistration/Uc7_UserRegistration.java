package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc7_UserRegistration {
    static String Password= "[A-Za-z\\d{1,}@$!%*?&]{8,}";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid Password(At least 1 Numeric number) ");
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
