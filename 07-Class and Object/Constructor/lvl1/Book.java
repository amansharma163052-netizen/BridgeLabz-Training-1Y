package com.gla.Constructor.lvl1;

class Book {
String title;
String author;
double price;

// Default Constructor
Book() {
    title = "Atomic Habits";
    author = "James Clear";
    price = 100.0;
}

// Parameterized Constructor
Book(String t, String a, double p) {
    title = t;
    author = a;
    price = p;
}

void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
}

public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("Java Basics", "James", 499);

    b1.display();
    b2.display();
}
}