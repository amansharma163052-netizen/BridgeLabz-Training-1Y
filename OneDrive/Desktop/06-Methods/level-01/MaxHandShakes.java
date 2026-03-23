package com.gla.Methods.level1;
import java.util.*;
public class MaxHandShakes {
    public int calcMaxHanshakes(int n) {
        int handShake = (n * (n - 1)) / 2;
        return handShake;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students -> ");
        int n = sc.nextInt();

        //call the method
        MaxHandShakes handShake = new MaxHandShakes();
        int maxHandshake = handShake.calcMaxHanshakes(n);

        //Printing the combinations of Handshakes
        System.out.println("Maximum number of Handshakes -> " + maxHandshake);
    }
}