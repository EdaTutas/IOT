package ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {

    static class User{
        private int id;
        private String name;
        private String email;

        public User(int id,String name,String email){
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id =id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
    private List<User> userList = new ArrayList<>();

    private static final Logger logger = Logger.getLogger(UserManager.class.getName());

    //Kullanıcı ekleme
    public void addUser(User user){
        userList.add(user);
        logger.log(Level.INFO, "User added: " + user);
    }

    //Kullanıcı listeleme

    public void listUsers(){
        if(userList.isEmpty()){
            System.out.println("No users available.");
        }
        else{
            for(User user : userList){
                System.out.println(user);
            }
        }
    }

    //Kullanıcı silme methodu

    public void deleteUser(int id){

        User userToRemove = null;

        for(User user : userList){
            if(user.getId() ==id){
                userToRemove=user;
                break;
            }
        }

        if(userToRemove !=null){
            userList.remove(userToRemove);
            logger.log(Level.INFO,"User removed: " + userToRemove);
        }
        else{
            System.out.println("User not found.");
        }
    }

    //Güncelleme
    public void updateUser(int id, String newName, String newEmail){
        //id=1 , name= eda tutaş akkoca , mail =eda@gmail.com
        for(User user : userList){
            if(user.getId() ==id){
                user = new User(id, newName ,newEmail);
                logger.log(Level.INFO, "User updated: " + user);
                break;
            }
        }

    }

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