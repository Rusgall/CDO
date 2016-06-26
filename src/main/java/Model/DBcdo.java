package Model;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Руслан on 26.06.2016.
 */
public class DBcdo {
    private final String HOST = "jdbc:mysql://localhost:3306/cdo";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBcdo(){
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
