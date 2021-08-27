package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.sql.SQLException;



public class Conection {

    private static String status = "não conectado.... ";

    public static Connection criarConexao()
		throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            Connection connection =  null;

            String serverName = "localhost/3306";

            String mydatabase = "db_almoxarife";

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";

            String password = "deusfiel";

        try {
            connection = DriverManager.getConnection( url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Class.forName("com.mysql.jdbc.Driver").newInstance();

            if(connection != null) {
                status = ("STATUS: conectado com sucesso");
            }else {
                status = ("STATUS: Não foi possivel realizar conexão");
            }

            return connection;
        }

        public static ResultSet execultarSelect(Connection conn, String sql) throws SQLException{
            Statement query = conn.createStatement();
            return query.executeQuery(sql);
        }

        public static java.sql.PreparedStatement prepararSql(Connection conn, String sql) throws SQLException{
            return conn.prepareStatement(sql);
        }
        public static String statusConection() {
            return status;
        }
}
