package Controller;

import Model.Logic;

/**
 * Created by Руслан on 26.06.2016.
 */
public class LoginCtr {
    Logic logic;
    FormManager manager;

    public LoginCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public void checkUser(String login, String pass){
        System.out.println(logic.checkUser(login,pass));
    }

    public void goRegister(String status){
        manager.toggle(status);
    }
}
