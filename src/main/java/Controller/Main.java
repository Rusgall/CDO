package Controller;

import Model.Logic;
import View.AdminPanel;
import View.Login;
import View.Register;
import View.TeacherPanel;

import javax.swing.*;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Main implements FormManager{
    Logic logic;

    Login login;
    Register register;
    AdminPanel adminPanel;
    TeacherPanel teacherPanel;

    RegisterCtr registerCtr;
    LoginCtr loginCtr;
    AdminCtr adminCtr;
    TeacherCtr teacherCtr;

    Main(){
        logic = new Logic();

        loginCtr = new LoginCtr(logic, this);
        registerCtr = new RegisterCtr(logic, this);
        adminCtr = new AdminCtr(logic, this);
        teacherCtr = new TeacherCtr(logic, this);


        login = new Login(loginCtr);
        register = new Register(registerCtr);
        adminPanel = new AdminPanel(adminCtr);
        teacherPanel = new TeacherPanel(teacherCtr);

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
            case "Login":
                login.setVisible(true);
                break;
            case "Register":
                register.setVisible(true);
                break;
            case "Admin":
                adminPanel.setVisible(true);
                break;
            case "Teacher":
                teacherPanel.setVisible(true);
                break;
            default:
                System.out.println("Error");
        }
    }

    public void falseVisible(){
        login.setVisible(false);
        register.setVisible(false);
        adminPanel.setVisible(false);
    }
}
