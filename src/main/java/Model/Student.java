package Model;

import java.util.ArrayList;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Student extends User {

    int questionsCount = 0;
    int rightAnswer = 0;

    String currentSubject = "Empty";

    ArrayList<Subject> subjects;

    public Student(String login, String password, String name, String status,ArrayList<Subject> subjects) {
        super(login, password, name, status);
        this.subjects = subjects;
    }

    public String getCurrentSubject() {
        return currentSubject;
    }

    public void setCurrentSubject(String currentSubject) {
        this.currentSubject = currentSubject;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public int getQuestionsCount() {
        return questionsCount;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void getAnswer(Question question, String answer){
        if(question.getAnswer().equals(answer))
            rightAnswer++;
        questionsCount++;

    }

    public void clear(){
        questionsCount = 0;
        rightAnswer = 0;
        currentSubject = "Empty";
    }

}
