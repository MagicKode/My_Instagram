package adminka.storage;

import adminka.entity.Subscription;
import adminka.entity.User;
import db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateInMemorySubscriptionDao {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addNewSubscription(Subscription subscription) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(subscription);
        transaction.commit();
        session.close();
    }

    public Subscription getSubscriptionByUser(String name) {
        Session session = sessionFactory.openSession();
        Query<Subscription> query = session.createQuery("from User where name =: name", Subscription.class);
        query.setParameter("name", name);
        Subscription singleResult = query.getSingleResult();
        return singleResult;
    }

    public List<Subscription> getAllSubscriptions() {
        Session session = sessionFactory.openSession();
        Query<Subscription> from_user = session.createQuery("from User", Subscription.class);
        List<Subscription> resultList = from_user.getResultList();
        return resultList;
    }

    public void deleteSubscriptionByUser(String name) {
        Session session = sessionFactory.openSession();
        Query<Subscription> query = session.createQuery("from User where name =: name", Subscription.class);
        query.setParameter("name", name);
        Subscription singleResult = query.getSingleResult();
        session.delete(singleResult);
    }

    public void deleteAllSubscriptions() {
        Session session = sessionFactory.openSession();
        session.clear();
    }
}
