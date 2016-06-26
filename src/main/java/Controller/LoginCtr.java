package Controller;

import Model.Logic;

/**
 * Created by Руслан on 26.06.2016.
 */
public class LoginCtr {
    Logic logic;

    public LoginCtr(Logic logic){
        this.logic = logic;
    }

    public void checkUser(String login, String pass){
        System.out.println(logic.checkUser(login,pass));
    }
}
