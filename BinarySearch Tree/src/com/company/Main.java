package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree = new Tree();
        tree.inset(25);
        tree.inset(20);
        tree.inset(15);
        tree.inset(27);
        tree.inset(30);
        tree.inset(29);
        tree.inset(26);
        tree.inset(22);
        tree.inset(32);


        tree.traverseInorder();
        System.out.println();
        System.out.println(tree.get(27).getData());
        System.out.println();
        System.out.println(tree.min());
        System.out.println(tree.max());

    }
}
