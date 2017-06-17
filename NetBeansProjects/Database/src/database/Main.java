/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author brijesh
 */
public class Main {
    public static void main(String[] args) {
        int rollNo;
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Search Student record....");
        System.out.println("Enter the student roll number:");
       rollNo =  scan.nextInt();
        System.out.println("Enter the student name: ");
        name = scan.next();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "Microsoft2017");
            Statement stmt = (Statement) con.createStatement();
            System.out.println("Database connect successfully.....");
            String searchString = "SELECT * FROM student WHERE name = '"+name+"' AND ID = '"+rollNo+"';";
            ResultSet rs = stmt.executeQuery(searchString);
            while (rs.next()) {                
                System.out.println("Roll No : " +rs.getInt("ID"));
                System.out.println("Name : " +rs.getString("name"));
                System.out.println("Age : " +rs.getInt("age"));
                System.out.println("Sex : " +rs.getString("sex"));
                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
                
    }
    
}
