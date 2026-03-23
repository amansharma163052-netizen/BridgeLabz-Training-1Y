package com.gla.Constructor.lvl1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int pricePerDay = 1500;

    // Constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    int calculateCost() {
        return rentalDays * pricePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Amit", "Swift", 4);
        r1.display();
    }
}