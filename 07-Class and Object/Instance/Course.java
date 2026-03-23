package com.gla.Instance;

class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "GLA University";

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Data Science", 8, 25000);

        c1.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Tech Institute");

        c2.displayCourseDetails();
    }
}