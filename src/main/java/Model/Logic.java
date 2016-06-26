package Model;


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


    public boolean checkUser(String login, String pass){
        String query = "select * from cdo.user";
        try {
            Statement statement = dBcdo.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                if((resultSet.getString(1).equals(login)) && (resultSet.getString(2).equals(pass)))
                    return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public void registerUser(String login,String pass, String name, String status){

    }

}
