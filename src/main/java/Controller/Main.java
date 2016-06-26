package Controller;

import Model.Logic;
import View.Login;

import javax.swing.*;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Main{
    Login login;
    Logic logic;
    LoginCtr loginCtr;

    Main(){
        logic = new Logic();
        loginCtr = new LoginCtr(logic);
        login = new Login(loginCtr);
        login.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
