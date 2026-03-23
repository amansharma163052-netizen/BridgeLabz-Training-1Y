package com.gla.Strings.level1;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {


        public static void Exception(String[] names) {

            System.out.println("Name at invalid index" + names[names.length]);
        }


        public static void handleException(String[] names) {

            try {
                System.out.println("Name at invalid index " + names[names.length]);
            }
            catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occurred!");
                System.out.println(" Index is outside the array bounds");
            }
            catch (RuntimeException e) {
                System.out.println("Runtime Exception caught!");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of names");
            int n = sc.nextInt();

            String[] names = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1));
                names[i] = sc.next();
            }

            handleException(names);
        }
    }

