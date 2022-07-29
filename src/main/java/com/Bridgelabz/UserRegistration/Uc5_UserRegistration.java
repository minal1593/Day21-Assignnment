package com.Bridgelabz.UserRegistration;

import java.util.Scanner;

public class Uc5_UserRegistration {
    static String Password= "[A-Za-z\\d@$!%*?&]{8,}$";

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid Password(Minimum 8 Characters) ");
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
