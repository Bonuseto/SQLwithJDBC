package com.fomin.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by EvgenyPC on 19.04.2017.
 */
public class DBWorker {

    private final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD );
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
