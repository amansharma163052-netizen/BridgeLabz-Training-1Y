package Package;

public class MainProgram {
    public static void main(String[] args) {

            double P = 10000;
            double R = 5;
            double T = 2;

            double SI = InterestCalculator.calculateSimpleInterest(P, R, T);
            double CI = InterestCalculator.calculateCompoundInterest(P, R, T);

            System.out.println("Simple Interest = " + SI);
            System.out.println("Compound Interest = " + CI);
        }
    }

