package adminka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private User user;

    public Subscription() {
    }

    public Subscription(int id, User user) {
        this.id = id;
        this.user = user;
    }

    public Subscription(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return id == that.id && user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
