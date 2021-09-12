package adminka.storage;

import adminka.entity.Post;
import adminka.entity.User;
import db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateInMemoryPostDao {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addNewPost(Post post) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(post);
        transaction.commit();
        session.close();
    }

    public Post getPost(String title) {
        Session session = sessionFactory.openSession();
        Query<Post> query = session.createQuery("from Post where title =:title", Post.class);
        query.setParameter("title", title);
        Post singleResult = query.getSingleResult();
        return null;
    }

    public List<Post> getAllPosts() {
        Session session = sessionFactory.openSession();
        Query<Post> from_post = session.createQuery("from User", Post.class);
        List<Post> resultList = from_post.getResultList();
        return resultList;
    }

    public void deleteAllPosts() {
        Session session = sessionFactory.openSession();
        session.clear();
    }

    public void deletePostByTitle(String title) {
        Session session = sessionFactory.openSession();
        Query<Post> query = session.createQuery("from Post where title = :title", Post.class);
        query.setParameter("title", title);
        Post singleResult = query.getSingleResult();
        session.delete(singleResult);
    }

    public void updateDescriptionByTitle(String title, String description) {
        Session session = sessionFactory.openSession();
        Query<Post> query = session.createQuery("from Post where title =:title", Post.class);
        query.setParameter("title", title);
        Post singleResult = query.getSingleResult();
        singleResult.setDescription(description);
        session.save(singleResult);
        session.close();
    }

}
