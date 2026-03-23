package com.gla.ClassAndObjectes.level1;
class Item {

    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

class Main{
    public static void main(String[] args) {

        Item item1 = new Item(101, "Pen", 10.5);

        item1.displayDetails();

        int quantity = 5;
        double totalCost = item1.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}