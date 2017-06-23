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
public class Java8List {

    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.add("F");
        items.add("G");
        items.add("H");
        
        //items.forEach(item -> System.out.println(item));
        //items.forEach(System.out::println);
        
//        items.forEach(item -> {
//            if ("C".equals(item)) {
//                System.out.println(item);
//            }
//        });

items.stream().filter(s -> s.contains("C")).forEach(System.out::println);
    }
    
}
