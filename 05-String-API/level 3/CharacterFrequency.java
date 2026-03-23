package com.gla.Strings.level3;
import java.util.Scanner;

class CharacterFrequency{

    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                uniqueCount++;
                freq[ch] = -freq[ch];
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0;
            }
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
            System.out.println(
                    frequencyData[i][0] + "\t\t" + frequencyData[i][1]
            );
        }
    }
}