package com.gla.Strings.level2;
import java.util.Scanner;

class StringLengthWithoutLengthMethod{

    public static int findLengthWithoutLength(String text) {

        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            }
            catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text ");
        String text = sc.next();

        int manualLength = findLengthWithoutLength(text);

        int builtInLength = text.length();

        System.out.println("Length without using length() " + manualLength);
        System.out.println("Length using built-in length() " + builtInLength);
    }
}
