package com.gla.ClassAndObjectes.level2;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter name -> ");
        s1.name= ip.nextLine();
        System.out.println("Enter Roll.no -> ");
        s1.rollno = ip.nextInt();
        System.out.println("Enter Marks -> ");
        s1.marks = ip.nextInt();

        s1.displayStudentDetails();
    }
}
