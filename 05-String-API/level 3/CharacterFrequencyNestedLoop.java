package com.gla.Strings.level3;
import java.util.Scanner;

class CharacterFrequencyNestedLoop{

    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int length = chars.length;

        int[] freq = new int[length];

        for (int i=0; i<length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text");
        String text = sc.nextLine();

        String[] frequencyResult = findCharacterFrequency(text);

        System.out.println("Character Frequency");
        System.out.println("");

        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i]);
        }
    }
}