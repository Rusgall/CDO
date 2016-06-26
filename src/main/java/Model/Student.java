package Model;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Student extends User {

    int questionsCount = 0;
    int rightAnswer = 0;

    public Student(String name, String login, String password, String status) {
        super(name, login, password, status);
    }

    public void getAnswer(Question question, String answer){

    }

    public void clear(){
        questionsCount = 0;
        rightAnswer = 0;
    }

}
