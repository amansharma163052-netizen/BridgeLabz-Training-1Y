package com.gla.Methods.level1;
import javax.swing.*;
import java.util.*;
public class SpringSeason {
    public int springDates (int Month,int Date) {
        if (Month == 3) {
            if (Date >= 20 && Date <= 31) {
                return 1;
            } }
           else if(Month==4) {
               return 1;
            }
           else if (Month == 5) {
               return 1;
           }
           if(Month==6 && Date<=20){
               return 1;
           }
           return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Month -> ");
        int Month=sc.nextInt();
        System.out.println("Enter the Date -> ");
        int Date=sc.nextInt();

        //call the method
        SpringSeason md=new SpringSeason();
        int Spring =md.springDates(Month,Date);

        if(Spring ==1){
            System.out.println("The month is Spring");
        }
        else if(Spring ==-1){
            System.out.println("The Month is not Spring");
        }
    }

}
