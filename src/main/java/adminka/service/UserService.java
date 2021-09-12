package adminka.service;

import adminka.entity.User;
import adminka.storage.HibernateInMemoryUserDao;

import java.util.List;

public class UserService {

    //private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();
    private final HibernateInMemoryUserDao userDao = new HibernateInMemoryUserDao();

    public boolean save(User newUser) {
        userDao.save(newUser);
        return true;
    }

    public User getUserByLogin(String login) {

        return userDao.getByLogin(login);
    }

    public void updateUserLogin(int id, String login) {
        userDao.updateLoginByUser(id, login);
    }

    public void updateUserName(int id, String name) {
        userDao.updateNameByUser(id, name);
    }

    public void updateUserPassword(int id, String password) {
        userDao.updatePasswordByUser(id, password);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void deleteUserByLogin(String login) {
        userDao.deleteUserByLogin(login);
    }

    public void deleteAllUsers() {
        userDao.deleteAllUsers();
    }
}
