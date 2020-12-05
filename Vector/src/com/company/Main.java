package com.company;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List employeeList = new Vector();
        employeeList.add(new Employee("Mina","Magdy",1));
        employeeList.add(new Employee("Mina","Tarek",234));
        employeeList.add(new Employee("Mina","Nadi",665));
        employeeList.add(new Employee("Mina","Maher",76533));
        employeeList.add(new Employee("Mina","wefky",9221));
    }
}
