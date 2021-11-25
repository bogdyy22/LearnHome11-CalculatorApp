package com.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nr1, nr2;

        try {
            System.out.print("Insert number 1: ");
            nr1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("insert number 2: ");
            nr2 = sc.nextDouble();
            sc.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }

        System.out.println("Insert the operator(+ - * / ): ");
        var op = sc.nextLine();

        double result;
        switch (op) {
            case "+":
                result = CalcHelper.addValues(nr1, nr2);
                break;
            case "-":
                result = CalcHelper.substractValues(nr1, nr2);
                break;
            case "*":
                result = CalcHelper.multipleValues(nr1, nr2);
                break;
            case "/":
                result = CalcHelper.divideValues(nr1, nr2);
                break;
            default:
                System.out.println("Error chose operators valid :) ");
                return;
        }
        System.out.println("The answer is " + result);


    }


}
