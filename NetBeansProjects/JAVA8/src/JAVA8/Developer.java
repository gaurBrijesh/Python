/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA8;

/**
 *
 * @author brijesh
 */
public class Developer {
String name;
int salary;
int age;

    public Developer(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

return "name = " +name + ", age = " + age + ", salary = "+ salary;
        }

    
}
