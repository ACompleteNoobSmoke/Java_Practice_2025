package org.repo;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConnectionSingleton {

    private static ConnectionSingleton singleton = null;
    private static Connection conn = null;

    private ConnectionSingleton() {
    }

    public static Connection getConnectionSingleton(String sqlName) throws ClassNotFoundException {
        if (singleton == null){
            singleton = new ConnectionSingleton();
            //Class.forName("com.mysql.jdbc.Driver");
            conn = getConnection(sqlName);
        }
        return conn;
    }

    public static void closeConnectionSingleton() throws SQLException {
        if(singleton == null) return;
        try {
            conn.close();
        } catch (SQLException e) {
            throw new SQLException("Connection Not Closed");
        }
    }

    private static Connection getConnection(String sqlName){
        String url = "jdbc:mysql://172.18.0.2:3307/" + sqlName;
        String username = System.getenv("MYSQL_USER");
        String password = System.getenv("MYSQL_PASS");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);


        try  {
            System.out.println("Connecting to database...");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to database!", e);
        }
    }
}
