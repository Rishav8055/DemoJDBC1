package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/CarSales";
            String user= "root";
            String pass= "root@123";
            Connection connection = DriverManager.getConnection(url,user,pass);
            if (connection != null){
                System.out.println("connection success");
                //statement
                Statement st = connection.createStatement();
                String sql="Insert into SalesPerson values(1235,'rishav','London',15)";
                int row=st.executeUpdate(sql);
                if (row==1){
                    System.out.println("data inserted");
                }else {
                    System.out.println("data not inserted");
                }
            }else {
                System.out.println("not connected");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}