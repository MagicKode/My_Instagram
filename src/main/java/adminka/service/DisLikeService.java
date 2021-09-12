package adminka.service;

import adminka.entity.DisLike;
import adminka.entity.User;
import adminka.storage.HibernateInMemoryDislikeDao;

import java.util.List;

public class DisLikeService {

    private final HibernateInMemoryDislikeDao hibernateInMemoryDislikeDao = new HibernateInMemoryDislikeDao();

    public void AddDisLike(DisLike disLike){
        hibernateInMemoryDislikeDao.addNewDisLike(disLike);
    }

    public DisLike getDisLike(String name){
        return hibernateInMemoryDislikeDao.getDisLikeByUser(name);
    }

    public List<DisLike> getAllDisLikes(){
        return hibernateInMemoryDislikeDao.getAllDisLikes();
    }

    public void deleteDesLike(String user){
        hibernateInMemoryDislikeDao.deleteDisLikeByUser(user);
    }

    public void deleteAllDisLikes(){
        hibernateInMemoryDislikeDao.deleteAllDisLikes();
    }
}
