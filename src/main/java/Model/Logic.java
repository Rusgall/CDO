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

}
