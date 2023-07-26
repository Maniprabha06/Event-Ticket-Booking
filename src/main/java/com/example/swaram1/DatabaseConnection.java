package com.example.swaram1;



import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;
    public Connection getConnection(){
        String dbName ="swaram";
        String dbUser ="root";
        String dbPwd ="krishna7";
        String url="jdbc:mysql://localhost/" + dbName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,dbUser,dbPwd);
        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }

}

