package Controller;

import Model.Logic;
import Model.Subject;
import View.TeacherPanel;

/**
 * Created by Руслан on 27.06.2016.
 */
public class TeacherCtr {
    Logic logic;
    FormManager manager;

    public TeacherCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public void addQuestion(String question, String answer, String subject, TeacherPanel teacherPanel){
        if(!subject.equals("Empty")) {
            logic.addQuestion(question, answer, subject);
        }else teacherPanel.label.setText("Выберите предмет");



    }
}
