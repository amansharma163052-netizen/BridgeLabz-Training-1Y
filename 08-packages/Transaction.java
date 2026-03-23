package Package;

public class Transaction {
    public void issueBook(Book book, Member member) {
            System.out.println("\nBook Issued Successfully!");
            System.out.println("Book: " + book.title);
            System.out.println("Issued To: " + member.name);
        }
    }

