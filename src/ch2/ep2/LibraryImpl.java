package ch2.ep2;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library{

    private List<Book> bookList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }
    @Override
    public List<Book> listBooks() {
        if(bookList.isEmpty()){
            System.out.println("No books available.");
        } else{
            for(Book book : bookList){
                System.out.println(book);
            }
        }
        return bookList;
    }
    @Override
    public void deleteBook(int id) {

        Book bookToRemove = null;

        for (Book book : bookList) {
            if (bookToRemove != null) {
                bookList.remove(bookToRemove);
            } else {
                System.out.println("Book not found.");
            }
        }
    }

    @Override
    public void updateBook(int id, String newTitle, String newAuthor, int newYear) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setYear(newYear);
                break;
            }
        }
    }
 // Yüzük Kardeşliği    yüzük kardeşliği    YÜZÜK KARDEŞLİĞİ
    @Override
    public Book findBookByTitle(String title) {
        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    /*
    Her kitabın bir yazarı vardır.
    Her yazarın sadece bir kitabı mı vardır? -- HAYIR

     */

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book book : bookList){
            if(book.getAuthor().equalsIgnoreCase(author)){  //Yüzük kardeşliği ,
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public void borrowBook(int bookId, int userId) { // klavyeden aldığım değerler
        for(Book book : bookList){
            if(book.getId() == bookId && !book.isBorrowed()){ //daha önce eklemiş olduğum kitaplar (kütüphanedeki kitaplar)
                book.setBorrowed(true);
                return;
            }
        }
        System.out.println("Book is not available or already borrowed");
    }

    @Override
    public void returnBook(int bookId) {
        for (Book book: bookList){
            if(book.getId() == bookId && book.isBorrowed()){
                book.setBorrowed(false);
                return;
            }
        }
        System.out.println("Book is not found or was not borrowed");
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public List<User> listUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : userList) {
                System.out.println(user);
            }
        }
        return userList;
    }

    @Override
    public void deleteUser(int id) {  User userToRemove = null;
        for (User user : userList) {
            if (user.getId() == id) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            userList.remove(userToRemove);
        } else {
            System.out.println("User not found.");
        }


    }

    @Override
    public void updateUser(int id, String newName, String newEmail) {
        for (User user : userList) {
            if (user.getId() == id) {
                user.setName(newName);
                user.setEmail(newEmail);
                break;
            }
        }
    }
}
