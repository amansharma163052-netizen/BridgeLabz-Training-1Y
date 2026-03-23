package com.gla.Strings.level3;
import java.util.Scanner;

class UniqueCharacters{

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

    public static char[] findUniqueCharacters(String text) {

        int length = findLengthWithoutLength(text);


        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("Unique Characters");
        for (int i = 0; i<uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
    }
}