package com.company;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToend(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null){
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;

        if(head.getNext() == null){
            tail = null;
        }
        else{
            head.getNext().setPrev(null);

        }
        head = head.getNext();
        size--;
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("NULL");
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
