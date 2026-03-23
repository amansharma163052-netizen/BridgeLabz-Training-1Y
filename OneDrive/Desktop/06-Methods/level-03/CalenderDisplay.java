package com.gla.Methods.level3;
import java.util.Scanner;

public class CalenderDisplay{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12) ");
        int month = sc.nextInt();

        System.out.print("Enter year ");
        int year = sc.nextInt();

        // Get month name
        String monthName = getMonthName(month);

        int daysInMonth = getDaysInMonth(month, year);

        int firstDay = getFirstDayOfMonth(month, 1, year);


        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        // Check leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get first day of the month (Gregorian algorithm)
    public static int getFirstDayOfMonth(int m, int d, int y) {

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }
}