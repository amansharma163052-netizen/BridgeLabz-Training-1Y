package com.gla.Methods.level1;
import java.util.Scanner;
public class SumOfNatNumUsingLoop{

    public  int naturalNumbers(int number) {
        int sum=0;
        if(number>0){
            for(int i=0; i<number; i++)
                sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int number = sc.nextInt();

        SumOfNatNumUsingLoop Sum= new SumOfNatNumUsingLoop ();
        int naturalNumberSum =  Sum.naturalNumbers(number);

        System.out.println(" the sum of n natural numbers: " +   naturalNumberSum );

    }
}