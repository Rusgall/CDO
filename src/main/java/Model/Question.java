package Model;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Question {
    String question,answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public Question(String question, String answer) {

        this.question = question;
        this.answer = answer;
    }
}
