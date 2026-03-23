package com.gla.Arrays;
import java.util.Scanner;
public class AmarAkbarAnthony {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] ages = new double[3];
            double[] heights = new double[3];
            String[] names = {"Amar", "Akbar", "Anthony"};

            for(int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + names[i] + ": ");
                ages[i] = sc.nextDouble();
                System.out.print("Enter height of " + names[i] + ": ");
                heights[i] = sc.nextDouble();
            }
            int youngestIdx = 0, tallestIdx = 0;
            for(int i = 1; i < 3; i++) {
                if(ages[i] < ages[youngestIdx]) youngestIdx = i;
                if(heights[i] > heights[tallestIdx]) tallestIdx = i;
            }

            System.out.println(names[youngestIdx] + " is youngest " + ages[youngestIdx] );
            System.out.println(names[tallestIdx] + " is tallest " + heights[tallestIdx]  );
            sc.close();
        }
    }

