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
import java.util.Scanner;

/**
 *
 * @author brijesh
 */
public class InsertStudent {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Student the name :");
        //scan.nextLine();
        String name = scan.next();
        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        System.out.println("Enter the sex of Student: ");
        String sex = scan.next();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "Microsoft2017");
            Statement stmt = (Statement) con.createStatement();
            System.out.println("Connection created sucessfully.....");
            String insert = "INSERT INTO student(name,age,sex) VALUES('" + name + "','" + age + "','" + sex + "');";
            stmt.execute(insert);
            System.out.println(name + " Record save successfuly...");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }

    }
}
