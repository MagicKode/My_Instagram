package adminka.storage;

import adminka.entity.Like;
import adminka.entity.Post;
import adminka.entity.User;
import db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateInMemoryLikeDao {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addNewLike(Like like){
        Session session = sessionFactory.openSession(); //связать с Постом и с Комментариями
        Transaction transaction = session.beginTransaction();
        session.save(like);
        transaction.commit();
        session.close();
    }

    public Like getLikeByUser(String name){
        Session session = sessionFactory.openSession();
        Query<Post> query = session.createQuery("from User where name =:name", Post.class);
        query.setParameter("name", name);
        Post singleResult = query.getSingleResult();
        return null;
    }

    public List<Like> getAllLikes(){
        Session session = sessionFactory.openSession();
        Query<Like> from_likes = session.createQuery("from User ", Like.class);
        List<Like> likes = from_likes.getResultList();
        return likes;
    }

    public void deleteLikeByUser(String user){
        Session session = sessionFactory.openSession();
        Query<Like> query = session.createQuery("from Like where user =:user", Like.class);
        query.setParameter("user", user);
        Like singleResult = query.getSingleResult();
        session.delete(singleResult);
    }

    public void deleteAllLikes(){
        Session session = sessionFactory.openSession();
        session.clear();
    }
}
