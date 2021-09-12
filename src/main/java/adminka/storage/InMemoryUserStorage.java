package adminka.storage;

import adminka.entity.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserStorage {

    private static final List<User> userList = new ArrayList<>();

    public boolean addNewUser(User user){
        return userList.add(user);
    }

    public User getUserByLogin(String login){
        for (User user : userList){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public User getUserByPassword(String password){
        for (User user : userList){
            if (user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public void updatePasswordByUser(int id, String password){
        for (User user1 : userList){
            if (user1.getId() == id){
                user1.setPassword(password);
            }
        }
    }
}
