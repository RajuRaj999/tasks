package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "root123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
           // statement.executeUpdate("CREATE DATABASE iqa");
            //statement.executeUpdate("CREATE TABLE iqa.student(id INT, name VARCHAR(70), phone VARCHAR(20))");
            statement.addBatch("INSERT INTO iqa.student VALUES (1, 'raju', '7997654325')");
            statement.addBatch("INSERT INTO iqa.student VALUES (2, 'sai', '8997654325')");
            statement.executeBatch();  // Execute the batch of statements
            if(connection!=null) {
            	System.out.println("yes it is created");
            }

            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
