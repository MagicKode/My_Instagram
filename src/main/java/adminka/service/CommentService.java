package adminka.service;

import adminka.entity.Comment;
import adminka.storage.HibernateMemoryCommentDao;

import java.util.List;

public class CommentService {

    private final HibernateMemoryCommentDao hibernateMemoryCommentDao = new HibernateMemoryCommentDao();

    public Comment getComment(int id){
        return hibernateMemoryCommentDao.getComment(id);
    }

    public List<Comment> getAllComments(){
        return hibernateMemoryCommentDao.getAllComments();
    }

    public void updateComment(String text, String title){
        hibernateMemoryCommentDao.updateCommentByTitle(text, title);
    }

    public void deleteComment(String name){
        hibernateMemoryCommentDao.deleteCommentByUser(name);
    }

    public void deleteAllComments(){
        hibernateMemoryCommentDao.deleteAllComments();
    }
}
