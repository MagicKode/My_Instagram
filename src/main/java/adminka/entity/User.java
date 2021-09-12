package adminka.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String login;
    private String password;
    private String sex; //boolean
    private String country;
    private String age;
    private String email;


    public User() {
    }

    public User(int id, String name, String login, String password, String sex, String country, String age, String email) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.sex = sex;
        this.country = country;
        this.age = age;
        this.email = email;
    }

    public User(String name, String login, String password,String sex,String country,String age,String email) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.sex = sex;
        this.country = country;
        this.age = age;
        this.email = email;
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && name.equals(user.name) && login.equals(user.login)
                && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
