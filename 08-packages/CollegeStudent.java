package Package;

public class CollegeStudent {

        String name;
        int roll;

        public CollegeStudent(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        public void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + roll);
        }
    }

