package Package;

public class LibraryRunner {

        public static void main(String[] args) {

            // 1. Adding a new book
            Book book1 = new Book(15, "Java Programming", "James Gosling");

            // 2. Registering a new member
            Member member1 = new Member(1, "Sonam");

            // Display details
            System.out.println("Book Details:");
            book1.displayBook();

            System.out.println("\nMember Details:");
            member1.displayMember();

            // 3. Issuing a book
            Transaction t = new Transaction();
            t.issueBook(book1, member1);
        }
    }

