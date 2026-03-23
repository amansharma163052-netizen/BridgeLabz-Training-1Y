package com.gla.Strings.level1;
import java.util.Scanner;
public class LowerCaseComparison {


        public static String convertToLowerUsingCharAt(String text) {

            String result = "";

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);


                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }

                result = result + ch;
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

            System.out.print("Enter the text");
            String text = sc.nextLine();

            String manualLower = convertToLowerUsingCharAt(text);

            String builtInLower = text.toLowerCase();

            boolean isSame = compareStringsUsingCharAt(manualLower, builtInLower);
            System.out.println("\nLowercase using charAt() " + manualLower);
            System.out.println("Lowercase using toLowerCase()" + builtInLower);
            System.out.println("Are both results equal" + isSame);
        }
    }
