package com.fomin.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by EvgenyPC on 17.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "select * from losers";

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

while (resultSet.next()){
    User user = new User();
   user.setId(resultSet.getInt(1));
   user.setUsername(resultSet.getString(2));
   user.setPassword(resultSet.getString(3));

    System.out.println(user);


}

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }}
