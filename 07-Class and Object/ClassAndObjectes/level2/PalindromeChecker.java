package com.gla.ClassAndObjectes.level2;

class PalindromeChecker {

    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        if (text.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to display result
    void displayResult() {

        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {

        PalindromeChecker obj = new PalindromeChecker("saras");

        obj.displayResult();
    }
}