package Package;

public class MainApp {

    public static void main(String[] args) {

        Student s = new Student("Sonam Tripathi", 101);
        Faculty f = new Faculty("Tanmay ", "Bridgelabz Trianing");

        System.out.println("Student Details:");
        s.displayStudent();

        System.out.println();

        System.out.println("Faculty Details:");
        f.displayFaculty();
    }
}
