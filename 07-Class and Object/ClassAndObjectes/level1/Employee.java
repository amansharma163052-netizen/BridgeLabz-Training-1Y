package com.gla.ClassAndObjectes.level1;

class Employee {

    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {


        Employee emp1 = new Employee();

        emp1.name = "Ak";
        emp1.id = 101;
        emp1.salary = 1000000;

        // Calling method
        emp1.displayDetails();
    }
}