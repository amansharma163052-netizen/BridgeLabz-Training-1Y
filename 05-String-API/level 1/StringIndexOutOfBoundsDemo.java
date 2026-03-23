package com.gla.Strings.level1;
import java.util.Scanner;

class StringIndexOutOfBoundsDemo{

    public static void generateException(String text) {

        System.out.println("Character at invalid index " + text.charAt(text.length()));
    }

    public static void handleException(String text) {

        try {
            System.out.println("Character at invalid index" + text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(" StringIndexOutOfBoundsException occurred");
            System.out.println(" Index is greater than or equal to string length");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text ");
        String text = sc.next();

        handleException(text);
    }
}
