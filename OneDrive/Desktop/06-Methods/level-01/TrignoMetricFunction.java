package com.gla.Methods.level1;
import java.util.Scanner;
public class TrignoMetricFunction {


        public static double[] calculateTrigonometricFunctions(double angle) {

            double radians = Math.toRadians(angle);

            double sinValue = Math.sin(radians);
            double cosValue = Math.cos(radians);
            double tanValue = Math.tan(radians);

            return new double[] {sinValue, cosValue, tanValue};
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter angle in degrees");
            double angle = sc.nextDouble();

            // Call method
            double[] result = calculateTrigonometricFunctions(angle);

            System.out.println("Sine value " + result[0]);
            System.out.println("Cosine value " + result[1]);
            System.out.println("Tangent value " + result[2]);

        }
    }
