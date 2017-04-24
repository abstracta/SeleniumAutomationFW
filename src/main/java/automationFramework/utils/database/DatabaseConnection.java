package automationFramework.utils.database;

import automationFramework.utils.GetProperties;
import org.apache.commons.lang3.StringUtils;

import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class DatabaseConnection {

    protected Connection connection;
    protected static GetProperties properties = new GetProperties();
    protected static String databaseServer = properties.getString("DB_SERVER");
    protected static String databaseUser = properties.getString("DB_USER");
    protected static String databasePassword = properties.getString("DB_PASSWORD");

    public Connection getConnection(){
        return this.connection;
    }

    public Statement createStatement() throws SQLException {
        return connection.createStatement();
    }

    public PreparedStatement createPreparedStatement(String query) throws SQLException {
        return connection.prepareStatement(query);
    }

    public void update(String query) throws SQLException {
        Statement statement = createStatement();
        int state = statement.executeUpdate(query);
        statement.close();
        if(state == -1){
            throw new SQLException("Error executing: " + query);
        }
    }

    public String executeSingleResultQuery(String query) throws SQLException {
        String result = StringUtils.EMPTY;
        try {
            PreparedStatement preparedStatement = createPreparedStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
            System.out.print("Error: " + e.getMessage());
        }
        finally {
            close();
        }
        return result;
    }

    public List<String> executeMultipleResultQuery(String query) throws SQLException {
        List<String> resultList = new LinkedList<String>();
        try {
            PreparedStatement preparedStatement = createPreparedStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resultList.add(resultSet.getString(1));
            }
        }
        catch (SQLException e) {
            System.out.print("Error " + e.getMessage());
        }
        finally {
            close();
        }
        return resultList;
    }

    public Map<String, String> executeManyValuesQuery(String query, List<String> values) throws SQLException {
        Map<String, String> resultMap = new HashMap<>();
        try {
            PreparedStatement preparedStatement = createPreparedStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                for(int i = 1; i <= values.size(); i++){
                    resultMap.put(values.get(i - 1), resultSet.getString(i));
                }
            }
        }
        catch (SQLException e) {
            System.out.print("Error " + e.getMessage());
        }
        finally {
            close();
        }
        return resultMap;
    }

    public void close() throws SQLException {
        connection.close();
    }
}
