package Package;

import static java.lang.Long.max;
import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class StaticImportDemo {



        public static void main(String[] args) {

            int a = -25;
            int b = 9;
            int c = 16;

            // Using different static methods of Math class
            System.out.println("Square root of 16: " + sqrt(c));
            System.out.println("9 raised to power 2: " + pow(b, 2));
            System.out.println("Maximum of 9 and 16: " + max(b, c));
            System.out.println("Minimum of 9 and 16: " + min(b, c));
            System.out.println("Absolute value of -25: " + abs(a));
        }
    }

