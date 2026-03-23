package com.gla.Constructor.lvl1;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aman", 20);
        Person p2 = new Person(p1);

        p1.show();
        p2.show();
    }
}