package adminka.storage;

import adminka.entity.User;
import db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateInMemoryUserDao {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void save(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public User getByLogin(String login){
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("from User where login = :login", User.class); //HQL
        query.setParameter("login", login);
        User singleResult = query.getSingleResult();
        return singleResult;
    }

    public List<User> getAllUsers(){
        Session session = sessionFactory.openSession();
        Query<User> from_user = session.createQuery("from User", User.class); //select * from users
        List<User> resultList = from_user.getResultList();
        return resultList;
    }

   /* public User getUserByPassword(String password){  //?? - особо никогда данный метод не применяется, - Лишний
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("from User where password = :password", User.class);
        query.setParameter("password", password);
        User singleResult = query.getSingleResult();
        return singleResult;
    }*/

    public void updatePasswordByUser(int id, String password){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        user.setPassword(password);
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void updateLoginByUser(int id, String login){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        user.setLogin(login);
        transaction.commit();
        session.close();
    }

    public void updateNameByUser(int id, String name){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        user.setName(name);
        transaction.commit();
        session.close();
    }
    public void deleteUserByLogin(String login){
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("from User where login =:login", User.class);
        query.setParameter("login", login);
        session.remove(login);
    }

    public void deleteAllUsers(){
        Session session = sessionFactory.openSession();
        session.clear();
    }

}
