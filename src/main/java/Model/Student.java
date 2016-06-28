package Model;

import java.util.ArrayList;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Student extends User {

    int questionsCount = 0;
    int rightAnswer = 0;

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    ArrayList<Subject> subjects;

    public Student(String name, String login, String password, String status,ArrayList<Subject> subjects) {
        super(name, login, password, status);
        this.subjects = subjects;
    }

    public void getAnswer(Question question, String answer){

    }

    public void clear(){
        questionsCount = 0;
        rightAnswer = 0;
    }

}
