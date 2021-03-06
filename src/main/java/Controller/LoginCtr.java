package Controller;

import Model.Logic;
import Model.User;

/**
 * Created by Руслан on 26.06.2016.
 */
public class LoginCtr {
    Logic logic;
    FormManager manager;
    User user;

    public LoginCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public void enter(String login, String pass){
        if(logic.checkUser(login,pass)){
            user = logic.getUser(login);
            manager.setUser(user);
            goUser(user);
        }
    }

    public void goNext(String status){
        manager.toggle(status);
    }
    public void goUser(User user){
        manager.toggle(user.getStatus());
    }

}
