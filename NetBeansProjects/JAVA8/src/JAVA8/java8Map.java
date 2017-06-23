/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brijesh
 */
public class java8Map {
    public static void main(String[] args) {
        
        Map<String, Integer> items = new HashMap<String, Integer>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.put("G", 70);
//        for (Map.Entry<String, Integer> entry : items.entrySet()) {
//
//            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());            
//        }

//items.forEach((k,v) -> System.out.println("Item : " +k + "  Count : " +v));

items.forEach((k,v) -> {
System.out.println("Item : " +k + "  Count : " +v);
    if ("E".equals(k)) {
        System.out.println("Hello E");
    }
});

   }
    
    
}
