package com.gla.ClassAndObjectes.level2;

public class Student {
    String name;
    int rollno;
    int marks;

    String gradingBasedOnMarks() {
        if (marks > 90) {
            return "O";
        } else if (marks <= 90 && marks > 80) {
            return "A+";
        } else if (80 >= marks && marks > 70) {
            return "A";
        } else {
            return "Fail";
        }
    }
    void displayStudentDetails() {
        System.out.println("Student's Name -> " + name);
        System.out.println("Student's roll no. -> " + rollno);
        System.out.println("Student's Marks -> " + marks);
        System.out.println("Student's Grade  -> " + gradingBasedOnMarks());
    }
}