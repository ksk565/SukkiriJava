package com.example.sample;

import java.sql.*;

public class Section12_1 {
    public static void main(String[] args) {
        try{
            Class.forName("org.h2.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
