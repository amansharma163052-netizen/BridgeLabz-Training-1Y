package com.gla.Strings.level2;

import java.util.Scanner;

class SplitTextComparison{

    public static int findLengthWithoutLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static String[] splitTextUsingCharAt(String text) {

        int length = findLengthWithoutLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text");
        String text = sc.nextLine();

        String[] manualSplit = splitTextUsingCharAt(text);

        String[] builtInSplit = text.split(" ");

        boolean isSame = compareStringArrays(manualSplit, builtInSplit);


        System.out.println("Words using user-defined method");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("Words using split() method");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Are both results equal" + isSame);
    }
}