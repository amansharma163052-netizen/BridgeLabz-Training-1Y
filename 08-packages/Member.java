package Package;

public class Member {


        int memberId;
        String name;

        public Member(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }

        public void displayMember() {
            System.out.println("Member ID: " + memberId);
            System.out.println("Member Name: " + name);
        }
    }

