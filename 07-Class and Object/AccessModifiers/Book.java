package com.gla.AccessModifiers;

class Book {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {

        EBook b = new EBook();

        b.ISBN = "978-23456";
        b.title = "Java Programming";
        b.setAuthor("Rahul");

        b.displayBook();
    }
}
