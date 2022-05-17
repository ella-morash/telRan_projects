package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	MyTree bst = new MyTree();
    bst.insert(47);
    bst.insert(21);
    bst.insert(76);
    bst.insert(18);
    bst.insert(52);
    bst.insert(82);
    bst.insert(27);

        System.out.println(bst.inOrderTraverse(bst.root, new ArrayList<>()));
        System.out.println(bst.preOrderTraverse(bst.root, new ArrayList<>()));
        System.out.println(bst.postOrderTraverse(bst.root, new ArrayList<>()));


    }
}
