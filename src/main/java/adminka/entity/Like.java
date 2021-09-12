package adminka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user;
    private String post;

    public Like() {
    }

    public Like(int id, String user, String post) {
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public Like(String user, String post) {
        this.user = user;
        this.post = post;

    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Like(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Like like = (Like) o;
        return id == like.id && user.equals(like.user) && post.equals(like.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, post);
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
