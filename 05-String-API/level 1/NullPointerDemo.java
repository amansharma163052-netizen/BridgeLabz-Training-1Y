package com.gla.Strings.level1;
public class NullPointerDemo {

    static void generateException() {
        String text = null;
        System.out.println(text.length());  // Exception
    }

    static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Handling Exception ===");
        handleException();
    }
}
