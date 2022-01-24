package src.poo.excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDB {
    static Connection connection;
    static String drive;
    static String url;
    static String db;
    static String user;
    static String password;
    public static void main(String[] args) {
        getConnection();
    }
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName(drive).newInstance();
                connection = DriverManager.getConnection(url + db, user, password);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
