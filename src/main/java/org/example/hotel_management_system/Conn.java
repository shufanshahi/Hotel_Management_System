package org.example.hotel_management_system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c= DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "Pi@31416");
            s = c.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
