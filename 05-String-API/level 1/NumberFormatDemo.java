package com.gla.Strings.level1;

import java.util.Scanner;

class NumberFormatDemo{


    public static void generateException(String text) {


        int number = Integer.parseInt(text);

        System.out.println("Number is " + number);
    }

    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is " + number);
        }
        catch (NumberFormatException e) {
            System.out.println(" NumberFormatException occurred!");
            System.out.println(" Input text is not a valid number");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value ");
        String text = sc.next();

        handleException(text);
    }
}