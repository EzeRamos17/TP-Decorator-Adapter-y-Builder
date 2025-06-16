package ejercicio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConnectionManager {

    private static Connection conn = null;
    private static Properties prop = null;

    private static Properties getProperties() {
        Properties prop = new Properties();
        try {
            ResourceBundle infoDataBase = ResourceBundle.getBundle("database");
            prop.setProperty("connection", infoDataBase.getString("db.url"));
            prop.setProperty("username", infoDataBase.getString("db.user"));
            prop.setProperty("password", infoDataBase.getString("db.password"));
        } catch (Exception e1) {
            throw new RuntimeException("Error al cargar la configuración de la base de datos", e1);
        }
        return prop;
    }

    private static void connect() throws SQLException {
        if (conn == null || conn.isClosed()) {
            prop = getProperties();
            conn = DriverManager.getConnection(
                    prop.getProperty("connection"),
                    prop.getProperty("username"),
                    prop.getProperty("password")
            );
            conn.setAutoCommit(true);
        }
    }

    public static void disconnect() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            conn = null;
        }
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            connect();
        }
        return conn;
    }
}
