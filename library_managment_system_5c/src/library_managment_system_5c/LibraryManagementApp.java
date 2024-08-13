package library_managment_system_5c;

import java.util.Scanner;

public class LibraryManagementApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (addBook, addMember, borrowBook, returnBook, listBooks, listMembers, exit):");
            command = scanner.nextLine();

            switch (command) {
                case "addBook":
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case "addMember":
                    System.out.println("Enter member name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter member ID:");
                    String memberId = scanner.nextLine();
                    library.addMember(new Member(name, memberId));
                    break;

                case "borrowBook":
                    System.out.println("Enter book ISBN:");
                    String borrowIsbn = scanner.nextLine();
                    System.out.println("Enter member ID:");
                    String borrowMemberId = scanner.nextLine();
                    if (library.borrowBook(borrowIsbn, borrowMemberId)) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book is not available.");
                    }
                    break;

                case "returnBook":
                    System.out.println("Enter book ISBN:");
                    String returnIsbn = scanner.nextLine();
                    if (library.returnBook(returnIsbn)) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book is not borrowed.");
                    }
                    break;

                case "listBooks":
                    for (Book book : library.getAllBooks()) {
                        System.out.println(book);
                    }
                    break;

                case "listMembers":
                    for (Member member : library.getAllMembers()) {
                        System.out.println(member);
                    }
                    break;

                case "exit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
