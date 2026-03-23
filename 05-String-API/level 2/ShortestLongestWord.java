package com.gla.Strings.level2;
import java.util.Scanner;

class ShortestLongestWord{


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
        int idx = 0;
        spaceIndexes[idx++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length;

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

    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLengthWithoutLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordLengthArray) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            int minLength = Integer.parseInt(wordLengthArray[minIndex][1]);
            int maxLength = Integer.parseInt(wordLengthArray[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text");
        String text = sc.nextLine();

        String[] words = splitTextUsingCharAt(text);

        String[][] wordLengthArray = createWordLengthArray(words);

        int[] resultIndexes = findShortestAndLongest(wordLengthArray);

        int shortestIndex = resultIndexes[0];
        int longestIndex = resultIndexes[1];

        System.out.println("Word\t\tLength");
        System.out.println("");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(
                    wordLengthArray[i][0] + "\t\t" +
                            Integer.parseInt(wordLengthArray[i][1]));
        }

        System.out.println("Shortest Word " + wordLengthArray[shortestIndex][0]);
        System.out.println("Longest Word " + wordLengthArray[longestIndex][0]);
    }
}
