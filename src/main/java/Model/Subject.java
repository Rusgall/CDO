package Model;

/**
 * Created by Руслан on 28.06.2016.
 */
public class Subject {
    public String getName() {
        return name;
    }

    public boolean isPassed() {
        return passed;
    }

    public int getRating() {
        return rating;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    String name;
    boolean passed;
    int rating;

    public Subject(String name, int rating ){
        this.name = name;
        this.rating = rating;
        if(rating!=0)
            passed = true;
        else passed = false;
    }

}
