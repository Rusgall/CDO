package Model;

/**
 * Created by Руслан on 26.06.2016.
 */
abstract public class User {
    String name, login, password, status;

    public User(String name, String login, String password, String status){
        this.name = name;
        this.login = login;
        this.password = password;
        this.status = status;
    }

}
