package Package;

import static java.lang.Math.pow;

public class InterestCalculator {


        // Method to calculate Simple Interest
        public static double calculateSimpleInterest(double P, double R, double T) {
            double SI = (P * R * T) / 100;
            return SI;
        }

        // Method to calculate Compound Interest
        public static double calculateCompoundInterest(double P, double R, double T) {
            double CI = P * (pow((1 + R / 100), T)) - P;
            return CI;
        }
    }

