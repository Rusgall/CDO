package Controller;

import Model.Logic;
import Model.Student;
import Model.Subject;
import Model.User;
import View.StudentPanel;

import java.util.ArrayList;

/**
 * Created by Руслан on 28.06.2016.
 */
public class StudentCtr {
    FormManager manager;
    Logic logic;
    Student student;

    public void setStudent(User user) {
        student = (Student) user;
        System.out.println(student.getSubjects().get(2).isPassed());
    }

    public StudentCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        for(Subject subject:student.getSubjects()){
            if(!subject.isPassed())
                names.add(subject.getName());
        }
        return names;
    }
    public void goStart(String subject, StudentPanel studentPanel){
        if(!subject.equals("Empty")){
            student.setCurrentSubject(subject);
            studentPanel.setVisible(false);
            manager.toggle("Question");
        }else studentPanel.label.setText("Выберите предмет");

    }
}
