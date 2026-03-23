package com.gla.Constructor.lvl1;

class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBookSystem(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBookSystem  b = new LibraryBookSystem("DSA Guide", "Rahul", 350);

        b.display();
        b.borrowBook();
        b.display();
    }
}
