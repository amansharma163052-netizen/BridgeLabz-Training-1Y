package com.gla.Strings.level2;
import java.util.Scanner;

class TrimStringUsingCharAt{

    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text with spaces");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);

        String manualTrim = createSubstringUsingCharAt(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        boolean isSame = compareStringsUsingCharAt(manualTrim, builtInTrim);


        System.out.println("Manual Trim Result [" + manualTrim + "]");
        System.out.println("Built-in trim() Result[" + builtInTrim + "]");
        System.out.println("Are both results equal " + isSame);
    }}
