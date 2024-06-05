package ch2.ep2;

import java.util.List;

public interface Library {
    /*
    Interface (Arayüz)
    - Hangi methodları kullanacağını belirteceğim.
    - Bu methodların nasıl kullanılacağını yazmayacağız.
    - Farklı sınıfların ortak bir işlevini paylaşmasını sağlar.
      interface - Sound - makesound(){ }
      interface - Move - move()
      class lardan çağırıp makesound(){ kedi miyavlar ,kuş cikcikler }
    - class implements ederler.
      yılan class ında sound ve move interface implements edersek. yılan tıslar . yılan sürünür.
     */

     void addBook(Book book);
     List<Book> listBooks();
     void deleteBook(int id);
     void updateBook(int id, String newTitle, String newAuthor, int newYear);
     Book findBookByTitle(String title);
     List<Book> findBooksByAuthor(String author);
     void borrowBook(int bookId, int userId);
     void returnBook(int bookId);
     void addUser(User user);
     List<User> listUsers();
     void deleteUser(int id);
     void updateUser(int id, String newName, String newEmail);
}
