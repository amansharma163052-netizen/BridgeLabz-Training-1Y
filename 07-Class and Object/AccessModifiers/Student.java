package com.gla.AccessModifiers;

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    // Setter for CGPA
    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {

        PostgraduateStudent s = new PostgraduateStudent();

        s.rollNumber = 101;
        s.name = "Aman";
        s.setCGPA(8.5);

        s.displayDetails();
    }
}