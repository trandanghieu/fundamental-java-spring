package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private static Connection connection;
    private static Properties properties = DbProvider.getProps();
    private static String DRIVER = properties.getProperty("DRIVER");
    private static String URL = properties.getProperty("URL");
    private static String USER = properties.getProperty("USER");
    private static String PASSWORD = properties.getProperty("PASSWORD");
    public static Connection getConnection() {
        if(connection == null){
            Properties props = DbProvider.getProps();
            try {
                Class.forName(DRIVER);
                connection =  DriverManager.getConnection(URL,USER,PASSWORD);

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;

    }
}
