package adminka.storage;

import adminka.entity.Comment;
import adminka.entity.Post;
import adminka.entity.User;
import db.HibernateUtil;
import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateMemoryCommentDao {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addNewComment(String text, String title) { //???? продумать СВЯЗЫВАНИЕ!!
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Post> query = session.createQuery("from Post where title =:title", Post.class);
        query.setParameter("title", title);
        Post singleResult = query.getSingleResult();
        session.save(text);
        transaction.commit();
        session.close();
    }

    public Comment getComment(int id) {
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("from User where id =:id", User.class);
        query.setParameter("id", id);
        User singleResult = query.getSingleResult();
        return null;
    }

    public List<Comment> getAllComments() {                   //???? продумать СВЯЗЫВАНИЕ!!
        Session session = sessionFactory.openSession();
        Query<Comment> from_user = session.createQuery("from Comment ", Comment.class);
        List<Comment> resultList = from_user.getResultList();
        return resultList;
    }

    public void updateCommentByTitle(String text, String title){
        Session session = sessionFactory.openSession();
        Query<Post> query = session.createQuery("from Post where title =:title", Post.class);
        query.setParameter("title", title);
        Post singleResult = query.getSingleResult();
        singleResult.setDescription(text);
        session.save(singleResult);
        session.close();
        int a = 2 > 5 ? 1:0;
    }

    public void deleteCommentByUser(String name){
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("from User where name =:name", User.class);
        query.setParameter("name", name);
        User singleResult = query.getSingleResult();
        session.delete(singleResult);
    }

    public void deleteAllComments(){
        Session session = sessionFactory.openSession();
        session.clear();
    }
}
