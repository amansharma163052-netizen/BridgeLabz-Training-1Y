package com.gla.Strings.level2;
import java.util.Scanner;

class VowelConsonantCounter{

    public static String checkVowelOrConsonant(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkVowelOrConsonant(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }


        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text");
        String text = sc.nextLine();

        int[] counts = countVowelsAndConsonants(text);

        System.out.println("Number of Vowels " + counts[0]);
        System.out.println("Number of Consonants" + counts[1]);
    }
}