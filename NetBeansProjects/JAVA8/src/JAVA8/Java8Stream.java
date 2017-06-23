/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author brijesh
 */
public class Java8Stream {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Spring","Node","Brijesh");
        List<String> result = lines.stream().filter(line -> !("Node").equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
    
}
