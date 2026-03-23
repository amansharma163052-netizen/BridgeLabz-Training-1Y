package com.gla.Strings.level3;
import java.util.Scanner;

class UniqueCharacterFrequency{

    public static char[] findUniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the text");
        String text = sc.nextLine();

        String[][] frequencyData = findCharacterFrequency(text);

        System.out.println("Character\tFrequency");
        System.out.println("");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1] );
        }
    }
}