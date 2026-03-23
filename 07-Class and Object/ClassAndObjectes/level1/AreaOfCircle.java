package com.gla.ClassAndObjectes.level1;


class AreaOfCircle {
   double r;
   void calculatedArea(){
       double area= Math.PI*r*r;
       System.out.println("Area of Circle -> "+area);
   }
   void calculateCircumference(){
       double Circumference = 2*Math.PI*r;
       System.out.println("Circumference of Circle -> "+Circumference);
   }

    public static void main(String[] args) {

       AreaOfCircle c1 = new AreaOfCircle();

       c1.r=7;

       c1.calculatedArea();
       c1.calculateCircumference();
    }
}
