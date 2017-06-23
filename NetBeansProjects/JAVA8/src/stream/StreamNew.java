/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author brijesh
 */
public class StreamNew {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(new  Person("Brijesh", 30),
                new Person("Amit", 31), new Person("Vikas", 25));
        Person result1 = person.stream().filter((p) -> "Brijesh".equals(p.getName()) && 30 == p.getAge())
                .findAny().orElse(null);
        System.out.println("result1: " + result1);
        
        Person result2 = person.stream().filter((p) -> {
            if ("Brijesh".equals(p.getName()) && 30 == p.getAge()) {
                return true;
            }
            return false;
        }).findAny().orElse(null);
        
        System.out.println("result2 :" + result2);
        
    }
    
}
