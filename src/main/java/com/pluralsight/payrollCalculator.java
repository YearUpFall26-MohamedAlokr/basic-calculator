package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println("Enter hours worked");
        float hours = input.nextFloat();
        System.out.println("Enter Payrate");
        float payrate = input.nextFloat();
        double result= hours*payrate;
        System.out.println(name+"  your pay is "+result+"$");
    }

}