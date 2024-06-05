package ch2.ep2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    LibraryImpl library = new LibraryImpl();
    Scanner scanner = new Scanner(System.in);

    int bookId = 1;
    int userId = 1;

    while(true)

    {
        System.out.println();
        System.out.println("*** 1 ***");
        System.out.println("1. Add Book");
        System.out.println("2. List Books");
        System.out.println("3. Delete Book");
        System.out.println("4. Update Book");
        System.out.println("*** 2 ***");
        System.out.println("5. Find Book by Title");
        System.out.println("6. Find Books by Author");
        System.out.println("7. Borrow Book");
        System.out.println("8. Return Book");
        System.out.println("*** 3 ***");
        System.out.println("9. Add User");
        System.out.println("10. List Users");
        System.out.println("11. Delete User");
        System.out.println("12. Update User");
        System.out.println("*** 4 ***");
        System.out.println("13. Exit");
        System.out.print("Choose an option: ");
        System.out.println();
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch (x) {
            case 1: // Add Book
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                System.out.print("Enter publication year: ");
                int year = scanner.nextInt();

                Book newBook = new Book(bookId++, title, author, year); //1
                library.addBook(newBook);
                break;
            case 2: // List Book
                library.listBooks();
                break;
            case 3: // Delete Book
                System.out.print("Enter book ID to delete: ");
                int deleteBookId = scanner.nextInt();
                library.deleteBook(deleteBookId);
                break;
            case 4: //Update Book
                System.out.print("Enter book ID to update: ");
                int updateBookId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new book title: ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter new book author: ");
                String newAuthor = scanner.nextLine();
                System.out.print("Enter new publication year: ");
                int newYear = scanner.nextInt();
                library.updateBook(updateBookId, newTitle, newAuthor, newYear);
                break;
            case 5: //findBookByTitle
                System.out.print("Enter book title to search: ");
                String searchTitle = scanner.nextLine();
                Book foundBook = library.findBookByTitle(searchTitle);
                if (foundBook != null) {
                    System.out.println("Book found: " + foundBook);
                } else {
                    System.out.println("Book not found");
                }
                break;
            case 6: //findBooksByAuthor
                System.out.print("Enter book author to search: ");
                String searchAuthor = scanner.nextLine();
                List<Book> booksByAuthor = library.findBooksByAuthor(searchAuthor);
                if (!booksByAuthor.isEmpty()) {
                    for (Book book : booksByAuthor) {
                        System.out.println(book);
                    }
                } else {
                    System.out.println("No books found by this author.");
                }
                break;
            case 7:
                System.out.print("Enter book ID to borrow: ");
                int borrowBookId = scanner.nextInt();
                System.out.print("Enter your user ID: ");
                int borrowerId = scanner.nextInt();
                library.borrowBook(borrowBookId, borrowerId);
                break;
            case 8: // return book
                System.out.print("Enter book ID to return: ");
                int returnBookId = scanner.nextInt();
                library.returnBook(returnBookId);
                break;
            case 9: //Add User
                System.out.print("Enter user name: ");
                String userName = scanner.nextLine();
                System.out.print("Enter user email: ");
                String userEmail = scanner.nextLine();
                User newUser = new User(userId++, userName, userEmail);
                library.addUser(newUser);
                break;
            case 10:
                library.listUsers();
                break;
            case 11:
                System.out.print("Enter user ID to delete: ");
                int deleteUserId = scanner.nextInt();
                library.deleteUser(deleteUserId);
                break;
            case 12:
                System.out.print("Enter user ID to update: ");
                int updateUserId = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new user name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new user email: ");
                String newEmail = scanner.nextLine();
                library.updateUser(updateUserId, newName, newEmail);
                break;
            case 13: // Exit
                System.out.println("Exit...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid option. Please try again.");

        }
    }

}
}
