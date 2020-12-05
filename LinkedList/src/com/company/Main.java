package com.company;

public class Main {

    public static void main(String[] args) {
        Employee Magdy = new Employee("Mina", "Magdy",1);
        Employee Maher = new Employee("Mina", "Maher",2);
        Employee Tarek = new Employee("Mina", "Tarek",3);
        Employee Wefky = new Employee("Mina", "Wefky",4);



        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(Magdy);
        list.addToFront(Maher);
        list.addToFront(Tarek);
        list.addToFront(Wefky);

        list.printList();
        System.out.println();

        System.out.println(list.getSize());
        list.removeFromFront();
        System.out.println(list.getSize());


    }
}
