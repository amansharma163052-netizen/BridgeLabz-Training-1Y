package com.gla.Arrays;

import java.util.Scanner;
public class DigiFreq {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number ");
            int number = sc.nextInt();

            int temp = number;
            int count = 0;

            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
            int[] digits = new int[count];

            temp = number;
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }
            int[] frequency = new int[10];
            for (int i = 0; i < count; i++) {
                frequency[digits[i]]++;
            }

            System.out.println("Digit Frequency");
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
                }
            }
        }
}
