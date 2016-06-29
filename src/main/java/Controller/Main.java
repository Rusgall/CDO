package Controller;

import Model.Logic;
import Model.Student;
import Model.User;
import View.*;

import javax.swing.*;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Main implements FormManager{
    Logic logic;
    User user;

    Login login;
    Register register;
    AdminPanel adminPanel;
    TeacherPanel teacherPanel;
    StudentPanel studentPanel;
    QuestionPanel questionPanel;


    RegisterCtr registerCtr;
    LoginCtr loginCtr;
    AdminCtr adminCtr;
    TeacherCtr teacherCtr;
    StudentCtr studentCtr;
    QuestionCtr questionCtr;

    Main(){
        logic = new Logic();

        loginCtr = new LoginCtr(logic, this);
        registerCtr = new RegisterCtr(logic, this);
        adminCtr = new AdminCtr(logic, this);
        teacherCtr = new TeacherCtr(logic, this);
        studentCtr = new StudentCtr(logic, this);
        questionCtr = new QuestionCtr(logic, this);


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
            case "Student":
                studentCtr.setStudent(getUser());
                studentPanel = new StudentPanel(studentCtr);
                studentPanel.setVisible(true);
                break;
            case "Question":
                questionCtr.setStudent(getUser());
                questionPanel = new QuestionPanel(questionCtr);
                questionPanel.setVisible(true);
                break;
            default:
                System.out.println("Error");
        }
    }

    public void falseVisible(){
        login.setVisible(false);
        register.setVisible(false);
        adminPanel.setVisible(false);
        teacherPanel.setVisible(false);
        //studentPanel.setVisible(false);
    }

    public void setUser(User user){
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}
