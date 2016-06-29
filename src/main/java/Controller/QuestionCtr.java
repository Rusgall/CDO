package Controller;

import Model.Logic;
import Model.Question;
import Model.Student;
import Model.User;
import View.QuestionPanel;

import java.util.ArrayList;

/**
 * Created by Руслан on 28.06.2016.
 */
public class QuestionCtr {
    Logic logic;
    FormManager manager;
    Student student;
    ArrayList<Question> questions;

    public QuestionCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }

    public void setStudent(User user){
        student = (Student)user;
        setQuestions();
    }
    public ArrayList<String> getQuestions(){
        questions = logic.getQuestion(student.getCurrentSubject());
        ArrayList<String> quest = new ArrayList<>();
        for(Question name:questions)
            quest.add(name.getQuestion());
        return quest;
    }

    public void setQuestions(){
        questions = logic.getQuestion(student.getCurrentSubject());
    }

    public void updateQuestion(QuestionPanel questionPanel){
        questionPanel.labelQuestion.setText(questions.get(student.getQuestionsCount()).getQuestion());
    }

    public void answer(QuestionPanel questionPanel, String answer){
        student.getAnswer(questions.get(student.getQuestionsCount()),answer);
        if(student.getQuestionsCount()<5)
            updateQuestion(questionPanel);
        else {
            logic.addRating(student);
            student.clear();
            questionPanel.setVisible(false);
            manager.toggle("Student");
        }
    }



}
