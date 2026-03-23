package com.gla.Strings.level1;
import java.util.Scanner;
public class CharArrComparison {


        public static char[] getCharsUsingCharAt(String text) {

            char[] chars = new char[text.length()];

            for (int i = 0; i < text.length(); i++) {
                chars[i] = text.charAt(i);
            }

            return chars;
        }

        public static boolean compareCharArrays(char[] arr1, char[] arr2) {

            if (arr1.length != arr2.length) {
                return false;
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the text ");
            String text = sc.next();

            char[] userDefinedArray = getCharsUsingCharAt(text);

            char[] builtInArray = text.toCharArray();

            boolean isSame = compareCharArrays(userDefinedArray, builtInArray);

            System.out.print("Characters using user-defined method ");
            for (int i = 0; i < userDefinedArray.length; i++) {
                System.out.print(userDefinedArray[i] + " ");
            }

            System.out.print("Characters using toCharArray() ");
            for (int i = 0; i < builtInArray.length; i++) {
                System.out.print(builtInArray[i] + " ");
            }

            System.out.println("Are both character arrays equal" + isSame);
        }
    }
