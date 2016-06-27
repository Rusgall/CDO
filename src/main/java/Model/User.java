package Model;

/**
 * Created by Руслан on 26.06.2016.
 */
abstract public class User {
    String name, login, password, status;

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public User(String name, String login, String password, String status){
        this.name = name;
        this.login = login;
        this.password = password;
        this.status = status;

    }

}
