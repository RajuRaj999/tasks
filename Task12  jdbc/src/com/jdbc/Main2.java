package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/iq";
        String user = "root";
        String pass = "root123";
        
        Scanner k = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = k.next();
        System.out.println("Enter Roll No:");
        int roll = k.nextInt();
        System.out.println("Enter Class:");
        String cls = k.next();
        
        // Ensure that your table and column names are correct
        String sql = "INSERT INTO students (name, roll, cls) VALUES (?, ?, ?)";
        
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, roll);
            pst.setString(3, cls);
            
            int m = pst.executeUpdate();
            if (m == 1)
                System.out.println("Inserted successfully");
            else
                System.out.println("Insertion failed");
            
            con.close();
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println(ex);
        } finally {
            k.close();
        }
    }
}



