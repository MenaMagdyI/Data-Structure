package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mina","Magdy",1));
        employeeList.add(new Employee("Mina","Tarek",234));
        employeeList.add(new Employee("Mina","Nadi",665));
        employeeList.add(new Employee("Mina","Maher",76533));
        employeeList.add(new Employee("Mina","wefky",9221));


        employeeList.set(1,new Employee("changed","changed",000));

        employeeList.add(3,new Employee("Hi ","Inserted",9221));


        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("Is Empty : "+ employeeList.isEmpty());
        System.out.println("Size : "+ employeeList.size());
        //should ovverride the equal method first
        System.out.println(employeeList.contains(new Employee("Mina","Magdy",1)));
        System.out.println(employeeList.indexOf(new Employee("Hi ","Inserted",9221)));
    }
}
