package org.repo;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ConnectionSingleton {

    private static ConnectionSingleton singleton = null;
    private static Connection conn = null;

    private String ENVIRONMENT;
    private String TABLE_NAME;

    private String DB_USER;

    private String DB_PASSWORD;

    private  String DB_HOST;

    private int DB_PORT;



    private ConnectionSingleton() {
        setEnv();
        setDB_HOST();
        setDB_USER();
        setDB_PASSWORD();
        setDB_PORT();
    }

    private void setEnv() {
        this.ENVIRONMENT = System.getenv("ENVIRONMENT");
    }

    private void setDB_HOST() {
        this.DB_HOST = (Objects.equals(ENVIRONMENT, "PROD")) ? "mysqlcontainer" : "localhost";
    }

    private void setDB_USER() {
        this.DB_USER = (Objects.equals(ENVIRONMENT, "PROD")) ? System.getenv("MYSQL_USER") : "root";
    }

    private void setDB_PASSWORD() {
        this.DB_PASSWORD = (Objects.equals(ENVIRONMENT, "PROD")) ? System.getenv("MYSQL_PASS") : "secret";
    }

    private void setDB_PORT() {
        this.DB_PORT = (Objects.equals(ENVIRONMENT, "PROD")) ? Integer.parseInt(System.getenv("MYSQL_PORT")) : 3307;
    }

    public static Connection getConnectionSingleton(String sqlName) throws ClassNotFoundException {
        if (singleton == null){
            singleton = new ConnectionSingleton();
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
        String url = "jdbc:mysql://" + singleton.DB_HOST + ":" + singleton.DB_PORT + "/" + sqlName;
        System.out.println("Username: " + singleton.DB_USER);
        System.out.println("Password: " + singleton.DB_PASSWORD);


        try  {
            System.out.println("Connecting to database...");
            return DriverManager.getConnection(url, singleton.DB_USER, singleton.DB_PASSWORD);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to database!", e);
        }
    }
}
