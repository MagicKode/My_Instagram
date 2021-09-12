package adminka.service;

import adminka.entity.Like;
import adminka.entity.User;
import adminka.storage.HibernateInMemoryLikeDao;

import java.util.List;

public class LikeService {

    private final HibernateInMemoryLikeDao hibernateInMemoryLikeDao = new HibernateInMemoryLikeDao();

    public void addNewLike(Like like) {
        hibernateInMemoryLikeDao.addNewLike(like);
    }

    public Like getLikeByUser(String name) {
        return hibernateInMemoryLikeDao.getLikeByUser(name);
    }

    public List<Like> getAllLikes() {
        return hibernateInMemoryLikeDao.getAllLikes();
    }

    public void deleteLikeByUser(String  user) {
        hibernateInMemoryLikeDao.deleteLikeByUser(user);
    }

    public void deleteAllLikes() {
        hibernateInMemoryLikeDao.deleteAllLikes();
    }
}
