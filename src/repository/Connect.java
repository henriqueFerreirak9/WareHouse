package repository;

import java.sql.*;

public class Connect {
    private static String status = "Not connected...";

    public static Connection createConnection()
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Connection connection;

        String serverName = "localhost:3306";
        String dataBaseName = "heart_sys_db";
        String url = "jdbc:mysql://" + serverName + "/" + dataBaseName;
        String userName = "root";
        String password = "";

        connection = DriverManager.getConnection(url, userName, password);

        Class.forName("com.mysql.jdbc.Driver").newInstance();

        if (connection != null) {
            status = ("STATUS: Connected successfully!");
        } else {
            status = ("STATUS: Connection failed");
        }

        return connection;
    }

    public static ResultSet executeSelect(Connection connection, String sql) throws SQLException {
        Statement query = connection.createStatement();

        return query.executeQuery(sql);
    }

    public static java.sql.PreparedStatement prepareSql(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    public static String statusConnection() {
        return status;
    }
}