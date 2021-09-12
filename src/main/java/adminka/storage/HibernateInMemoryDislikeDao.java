package adminka.storage;

import adminka.entity.DisLike;
import adminka.entity.Like;
import adminka.entity.Post;
import adminka.entity.User;
import db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateInMemoryDislikeDao {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addNewDisLike(DisLike disLike){
        Session session = sessionFactory.openSession(); //связать с Постом и с Комментариями
        Transaction transaction = session.beginTransaction();
        session.save(disLike);
        transaction.commit();
        session.close();
    }

    public DisLike getDisLikeByUser(String name){
        Session session = sessionFactory.openSession();
        Query<Post> query = session.createQuery("from User where name =:name", Post.class);
        query.setParameter("name", name);
        Post singleResult = query.getSingleResult();
        return null;
    }

    public List<DisLike> getAllDisLikes(){
        Session session = sessionFactory.openSession();
        Query<DisLike> from_disLikes = session.createQuery("from User ", DisLike.class);
        List<DisLike> disLikes = from_disLikes.getResultList();
        return disLikes;
    }

    public void deleteDisLikeByUser(String user){
        Session session = sessionFactory.openSession();
        Query<DisLike> query = session.createQuery("from DisLike where user =:user", DisLike.class);
        query.setParameter("user", user);
        DisLike singleResult = query.getSingleResult();
        session.delete(singleResult);
    }

    public void deleteAllDisLikes(){
        Session session = sessionFactory.openSession();
        session.clear();
    }
}
