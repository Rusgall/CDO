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
        System.out.println(subject);
        if(!subject.equals("Empty")) {
            if(!logic.checkQuestion(question,subject)){
                logic.addQuestion(question, answer, subject);
                teacherPanel.label.setText("Добавлен вопрос");
            }
            else teacherPanel.label.setText("Такой вопрос уже есть");
        }else teacherPanel.label.setText("Выберите предмет");



    }

    public void goNext(String status){
        manager.toggle(status);
    }
}
