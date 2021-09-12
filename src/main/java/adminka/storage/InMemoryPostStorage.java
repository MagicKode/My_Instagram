package adminka.storage;

import adminka.entity.Post;
import adminka.entity.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPostStorage {

    private static final List<Post> postList = new ArrayList<>();

    public boolean addNewPost(Post post){
        return postList.add(post);
    }

    public Post getPostByUser(User user){
        for (Post post : postList){
            if (post.getUser().equals(user)){
                return post;
            }
        }
        return null;
    }

    public List<Post> getAllPosts(){
        return postList;
    }

    public void deleteAllPosts(){
        postList.clear();
    }

    public void deletePostByUser(User user) {
        for (Post post : postList){
            if (post.getUser().equals(user)){
                postList.remove(post);
            }
        }
    }

    public void updateDescription(int id, String description){
        for (Post post : postList) {
            if (post.getId() == id) {
                post.setDescription(description);
                break;
            }
        }
    }


}
