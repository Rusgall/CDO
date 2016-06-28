package Controller;

import Model.Logic;
import Model.Student;
import Model.Subject;

import java.util.ArrayList;

/**
 * Created by Руслан on 28.06.2016.
 */
public class StudentCtr {
    FormManager manager;
    Logic logic;
    Student student;

    public StudentCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
        student = (Student) manager.getUser();
    }

    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        for(Subject subject:student.getSubjects()){
            if(!subject.isPassed())
                names.add(subject.getName());
        }
        return names;
    }
    public void goStart(String subject){

    }
}
