package com.gla.Methods.level1;
import java.util.*;

public class RoundOfPark {

    public int calculateRounds(int side1, int side2, int side3) {

        int perimeter = side1 + side2 + side3;
        int totalRounds = 5000 / perimeter;   // 5 km = 5000 meters
        return totalRounds;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Side 1 (in meters): ");
        int side1 = sc.nextInt();

        System.out.println("Enter Side 2 (in meters): ");
        int side2 = sc.nextInt();

        System.out.println("Enter Side 3 (in meters): ");
        int side3 = sc.nextInt();

        RoundOfPark triangularPark = new RoundOfPark();
        int rounds = triangularPark.calculateRounds(side1, side2, side3);

        System.out.println("Number of complete rounds needed to finish 5 km: " + rounds);
    }
}