package adminka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private User user;
    private String image;
    private String description;

    public Post() {
    }

    public Post(int id, String title, User user, String image, String description) {
        this.id = id;
        this.title = title;
        this.user = user;
        this.image = image;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && title.equals(post.title) && user.equals(post.user)
                && image.equals(post.image) && description.equals(post.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, user, image, description);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
