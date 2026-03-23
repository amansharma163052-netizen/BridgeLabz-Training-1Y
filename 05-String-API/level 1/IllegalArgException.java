package com.gla.Strings.level1;
import java.util.Scanner;
public class IllegalArgException {
        public static void generateException(String text) {

            System.out.println("Substring" + text.substring(5, 2));
        }

        public static void handleException(String text) {

            try {
                System.out.println("Substring" + text.substring(5, 2));
            }
            catch (IllegalArgumentException e) {
                System.out.println("Exception caught: IllegalArgumentException occurred!");
                System.out.println("Reason: Start index is greater than end index");
            }
            catch (RuntimeException e) {
                System.out.println("Runtime Exception caught!");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a text ");
            String text = sc.next();
            handleException(text);
        }
}
