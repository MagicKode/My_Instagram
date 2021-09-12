package adminka.service;

import adminka.entity.Post;
import adminka.entity.User;
import adminka.storage.HibernateInMemoryPostDao;

import java.util.List;

public class PostService {

    //private final InMemoryPostStorage inMemoryPostStorage = new InMemoryPostStorage();
    private final HibernateInMemoryPostDao hibernateMemoryPostDao = new HibernateInMemoryPostDao();

    public boolean save(Post newPost) {
        hibernateMemoryPostDao.addNewPost(newPost);
        return true;
    }

    public Post getPostByUser(String title) {
        return hibernateMemoryPostDao.getPost(title);
    }

    public List<Post> getAllPosts() {
        return hibernateMemoryPostDao.getAllPosts();
    }

    public void deletePostByTitle(String title) {
        hibernateMemoryPostDao.deletePostByTitle(title);
    }

    public void deleteAllPosts() {
        hibernateMemoryPostDao.deleteAllPosts();
    }

    public void updateDescription(String title, String description) {
        hibernateMemoryPostDao.updateDescriptionByTitle(title, description);
    }



}
