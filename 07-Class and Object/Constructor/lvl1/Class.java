package com.gla.Constructor.lvl1;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.display();
        c2.display();
    }
}

