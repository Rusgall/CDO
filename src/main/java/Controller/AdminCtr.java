package Controller;

import Model.Logic;
import View.AdminPanel;

/**
 * Created by Руслан on 27.06.2016.
 */
public class AdminCtr {
    Logic logic;
    FormManager manager;

    public AdminCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public void registerTeacher(String login, String pass, String name, AdminPanel adminPanel){
        if(logic.checkUser(login)){
            logic.registerUser(login, pass, name, "Teacher");
            adminPanel.label.setText("Успешно");
        }
        else
            adminPanel.label.setText("Этот Логин занят");

    }
    public void goNext(String status){
        manager.toggle(status);
    }
}
