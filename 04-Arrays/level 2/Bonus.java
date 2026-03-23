package com.gla.Arrays;

import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        int index = 0;

        while(index < 10) {
            System.out.print("Enter salary for employee " + (index+1) + ": ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double year = sc.nextDouble();

            if(salary <= 0 || year < 0) {
                System.out.println("Invalid input! Enter again.");
                continue;
            }

            salaries[index] = salary;
            years[index] = year;
            index++;
        }

        for(int i = 0; i < 10; i++) {
            double bonus = (years[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.printf("Total Bonus Payout: ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary: ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f\n", totalNewSalary);
    }
}

