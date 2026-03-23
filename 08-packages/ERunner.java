package Package;

public class ERunner {
    public static void main(String[] args) {

            SalesReport sales = new SalesReport();
            EmployeeReport hr = new EmployeeReport();

            System.out.println("----- Company Combined Report -----");

            sales.showSalesData();
            System.out.println();

            hr.showEmployeePerformance();
        }
    }

