package com.pluralsight;
import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        System.out.println("Enter operation + , - , * , / ");
        char operation = input.next().charAt(0);
        calcSwitch(operation, num1, num2);

    }



    public static double calcSwitch(char operation, int num1, int num2) {
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                }
                break;

        }

        return result;
    }
}