/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author brijesh
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Brijesh"));
        list.add(new Student(2, "Kumar"));
        list.add(new Student(3, "Amit"));
        Collections.sort(list, new sortName());
        for (Object object : list) {
            System.out.println(object.toString());
        }
        
    }
    
}
