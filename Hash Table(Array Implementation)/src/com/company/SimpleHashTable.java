package com.company;

public class SimpleHashTable {
    private Employee[] hashtable;

    public SimpleHashTable(){
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedkey = hashkey(key);
        if (hashtable[hashedkey] != null){
            System.out.println("sorry, there is an employee in the position "+ hashedkey);
        }else{
            hashtable[hashedkey] = employee;
        }
    }

    public Employee get(String key){
        int hashedkey = hashkey(key);

        return hashtable[hashedkey];
    }

    private int hashkey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for (int i=0; i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
