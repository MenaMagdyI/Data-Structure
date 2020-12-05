package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee Magdy = new Employee("Mina", "Magdy",1);
        Employee Maher = new Employee("Mina", "Maher",2);
        Employee Tarek = new Employee("Mina", "Tarek",3);
        Employee Wefky = new Employee("Mina", "Wefky",4);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Magdy", Magdy);
        hashTable.put("Maherr", Maher);
        hashTable.put("Tarrekk", Tarek);
        hashTable.put("Wefky", Wefky);  // collision

        hashTable.printHashtable();
    }
}
