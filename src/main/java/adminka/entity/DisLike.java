package adminka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class DisLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user;
    private String post;

    public DisLike() {
    }

    public DisLike(int id, String user, String post) {
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public DisLike(String user, String post) {
        this.user = user;
        this.post = post;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisLike disLike = (DisLike) o;
        return id == disLike.id && user.equals(disLike.user) && post.equals(disLike.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, post);
    }

    @Override
    public String toString() {
        return "DisLike{" +
                "id=" + id +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}
