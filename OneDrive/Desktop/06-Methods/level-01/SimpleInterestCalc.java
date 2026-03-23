package com.gla.Methods.level1;
import java.util.Scanner;

public class SimpleInterestCalc {
    public double calcSI(double p,double r, double t){
        double  si=(p*r*t)/100;
        return si;
    }
public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Principle ->");
        double p=sc.nextDouble();
        System.out.println("Enter the Rate -> ");
        double r= sc.nextDouble();
        System.out.println("Enter the Time -> ");
        double t=sc.nextDouble();

        //calling the method of calculating si
        SimpleInterestCalc si=new SimpleInterestCalc();
        double simplInt= si.calcSI(p,r,t);

        //printing the Simple Interest as Output
       System.out.println("Simple Interest -> "+simplInt);

    }}

