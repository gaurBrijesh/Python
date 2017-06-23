/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brijesh
 */
public class testSorting {
    public static void main(String[] args) {
        List<Developer> listDev = getDeveloper();
        
        System.out.println("Before sort...");
        
        for (Developer developer : listDev) {
            System.out.println(developer);
        }
        
        System.out.println("After sort...");
        
        listDev.sort((Developer o1 , Developer o2)-> o1.getName().compareTo(o2.getName()));
        listDev.forEach((developer) -> System.out.println(developer));
    }
    
    private static List<Developer> getDeveloper(){
        List<Developer> result = new ArrayList<Developer>();
        
        result.add(new Developer("Brijesh", 700000, 33));
        result.add(new Developer("Vrijesh", 750000, 30));
        result.add(new Developer("Nrijesh", 770000, 31));
        result.add(new Developer("Crijesh", 800000, 32));
        result.add(new Developer("Rrijesh", 1700000, 35));
        return result;
    }
    
    
}
