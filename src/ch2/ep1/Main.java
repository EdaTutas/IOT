package ch2.ep1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserManager userManager =new UserManager();
        Scanner scanner = new Scanner(System.in);

        int userId = 1;

        while(true){
            System.out.println();
            System.out.println("1. Add User");
            System.out.println("2. List User ");
            System.out.println("3. Delete User");
            System.out.println("4. Update User");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int x = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (x){
                case 1 : //ekleme
                    System.out.println("Enter user name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter user email: ");
                    String email = scanner.nextLine();
                    User newUser = new User(userId++, name ,email);
                    userManager.addUser(newUser);
                    break;
                case 2 : //listeleme
                    userManager.listUsers();
                    break;
                case 3 : //silme
                    System.out.println("Enter user ID to delete: ");
                    int deleteId = scanner.nextInt();
                    userManager.deleteUser(deleteId);
                    break;
                case 4 : //güncelleme
                    System.out.println("Enter user ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.println("Enter new user name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new user email: ");
                    String newEmail = scanner.nextLine();
                    userManager.updateUser(updateId, newName,newEmail);
                    break;
                case 5 :
                    System.out.println("Exit...");
                    scanner.close();
                    break;
            }
        }
    }
}
