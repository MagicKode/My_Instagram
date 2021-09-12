package adminka.service;

import adminka.entity.Subscription;
import adminka.entity.User;
import adminka.storage.HibernateInMemorySubscriptionDao;

import java.util.List;

public class SubscriptionService {

    private final HibernateInMemorySubscriptionDao hibernateInMemorySubscriptionDao = new HibernateInMemorySubscriptionDao();

    public boolean addNewSubscription(Subscription subscription){
        hibernateInMemorySubscriptionDao.addNewSubscription(subscription);
        return true;
    }

    public Subscription getSubscription(String name){
        return hibernateInMemorySubscriptionDao.getSubscriptionByUser(name);
    }

    public List<Subscription> getAllSubscriptions(){
        return hibernateInMemorySubscriptionDao.getAllSubscriptions();
    }

    public void deleteSubscription(String name){
        hibernateInMemorySubscriptionDao.deleteSubscriptionByUser(name);
    }

    public void deleteAllSubscriptions(){
        hibernateInMemorySubscriptionDao.deleteAllSubscriptions();
    }
}
