package automationFramework.utils.database.mysql;

import automationFramework.utils.database.DatabaseConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection extends DatabaseConnection {

    public MySqlConnection(String databaseName) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            throw new SQLException("mysql database driver not found");
        }
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://" + databaseServer + "/" + databaseName,
                databaseUser,
                databasePassword
        );
    }
}
