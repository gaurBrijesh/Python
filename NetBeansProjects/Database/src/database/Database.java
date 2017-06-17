/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author brijesh
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "Microsoft2017");
          Statement stmt = (Statement)con.createStatement();
            System.out.println("Connection created sucessfully.....");    
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
 
    }
    
}
