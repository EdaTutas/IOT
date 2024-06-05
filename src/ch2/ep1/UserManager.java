package ch2.ep1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {
    private List<User> userList = new ArrayList<>();

    private static final Logger logger = Logger.getLogger(UserManager.class.getName());

    //Kullanıcı ekleme
    public void addUser(User user) {
        userList.add(user);
        logger.log(Level.INFO, "User added: " + user);
    }

    //Kullanıcı listeleme

    public void listUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }

    //Kullanıcı silme methodu

    public void deleteUser(int id) {

        User userToRemove = null;

        for (User user : userList) {
            if (user.getId() == id) {
                userToRemove = user;
                break;
            }
        }

        if (userToRemove != null) {
            userList.remove(userToRemove);
            logger.log(Level.INFO, "User removed: " + userToRemove);
        } else {
            System.out.println("User not found.");
        }
    }

    //Güncelleme
    public void updateUser(int id, String newName, String newEmail) {
        //id=1 , name= eda tutaş akkoca , mail =edatutas@gmail.com
        for (User user : userList) {
            if (user.getId() == id) {
                user = new User(id, newName, newEmail);
                logger.log(Level.INFO, "User updated: " + user);
                break;
            }
        }
    }
}
