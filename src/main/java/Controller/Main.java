package Controller;

import Model.Logic;
import View.Login;

import javax.swing.*;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Main {
    Login login;
    Logic logic = new Logic();
    LoginCtr loginCtr = new LoginCtr(logic);



    void start(Main application){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login(application);
            }
        });
    }

    public static void main(String[] args){
        Main application = new Main();
        application.start(application);
    }
}
