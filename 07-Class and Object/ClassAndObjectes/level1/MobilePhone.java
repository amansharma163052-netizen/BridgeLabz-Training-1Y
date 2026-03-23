package com.gla.ClassAndObjectes.level1;

public class MobilePhone {

    String Company;
    String Model;
    double price;

    MobilePhone(String Brand,String name,double p){
     Company=Brand;
     Model=name;
     price=p;
    }
    void DisplayDetails(){
        System.out.println("Model -> "+Model);
        System.out.println("Company -> "+Company);
        System.out.println("Price -> "+price);
    }
}
class Mobile{
    public static void main(String[] args) {
        MobilePhone M1= new MobilePhone("Apple","Iphone 17",80000);

        M1.DisplayDetails();

    }
}

