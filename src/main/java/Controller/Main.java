package Controller;

import Model.Logic;
import View.Login;
import View.Register;

import javax.swing.*;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Main implements FormManager{
    Logic logic;

    Login login;
    Register register;

    RegisterCtr registerCtr;
    LoginCtr loginCtr;

    Main(){
        logic = new Logic();

        loginCtr = new LoginCtr(logic,this);
        registerCtr = new RegisterCtr(logic,this);

        login = new Login(loginCtr);
        register = new Register(registerCtr);

        login.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

    public void toggle(String status){
        falseVisible();

        switch (status){
            case "login":
                login.setVisible(true);
                break;
            case  "register":
                register.setVisible(true);
                break;
            default:
                System.out.println("Error");
        }
    }

    public void falseVisible(){
        login.setVisible(false);
        register.setVisible(false);
    }
}
