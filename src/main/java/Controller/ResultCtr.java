package Controller;

import Model.Logic;
import Model.Student;
import Model.Subject;
import Model.User;
import View.ResultPanel;

import javax.swing.*;

/**
 * Created by Руслан on 29.06.2016.
 */
public class ResultCtr {
    Logic logic;
    FormManager manager;
    Student student;

    public ResultCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public void setStudent(User user) {
        student = (Student)user;
    }

    public void setResult(ResultPanel resultPanel){
        for(Subject subject: student.getSubjects()){
            resultPanel.add(new JLabel(subject.getName()));
            resultPanel.add(new JLabel(String.valueOf(subject.getRating())));
        }

    }

}
