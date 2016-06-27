package Model;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Руслан on 26.06.2016.
 */
public class Logic {
    DBcdo dBcdo;
    public Logic(){
        dBcdo = new DBcdo();
    }


    public boolean checkUser(String login){
        String query = "select * from cdo.user";
        try {
            Statement statement = dBcdo.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                if((resultSet.getString(1).equals(login)))
                    return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }
    public boolean checkUser(String login, String pass){
        String query = "select * from cdo.user";
        try {
            Statement statement = dBcdo.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                if((resultSet.getString(1).equals(login))&&(resultSet.getString(2).equals(pass)))
                    return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public User getUser(String login){
        try {
            PreparedStatement statement = dBcdo.getConnection().prepareStatement("select * from cdo.user where Login = ?");
            statement.setString(1,login);
            ResultSet resultSet = statement.executeQuery();
            return createUser(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void registerUser(String login,String pass, String name, String status){
        try {
            PreparedStatement statement = dBcdo.getConnection().
                    prepareStatement("Insert into cdo.user (Login, Pass, Name, Status) values (?,?,?,?);");
            statement.setString(1,login);
            statement.setString(2,pass);
            statement.setString(3,name);
            statement.setString(4,status);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addQuestion(String question, String answer, String subject){
        try {
            System.out.println("Logic");
            PreparedStatement statement = dBcdo.getConnection().
                    prepareStatement("Insert into cdo.questions (Question, Answer, Subject) values (?,?,?);");
            statement.setString(1,question);
            statement.setString(2,answer);
            statement.setString(3,subject);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private User createUser(ResultSet resultSet){
        try {
            resultSet.next();

            if (resultSet.getString(4).equals("Admin"))
                return new Admin(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            if (resultSet.getString(4).equals("Student"))
                return new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            if (resultSet.getString(4).equals("Teacher"))
                return new Teacher(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
