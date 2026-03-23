package com.gla.Methods.level1;
import java.util.*;
public class NumberNatureChecker {
    public int numberChecker(int n){
        if(n>0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number -> ");
        int n=sc.nextInt();

        NumberNatureChecker nc=new NumberNatureChecker();
        int NatureOfNum =nc.numberChecker(n);

        System.out.println("The Number is -> "+NatureOfNum);
    }
}
