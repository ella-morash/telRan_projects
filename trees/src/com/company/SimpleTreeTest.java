package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

class SimpleTreeTest {
    SimpleTree tree;
    Iterator<String> iterator;
    @BeforeEach
    void init(){
        tree=new SimpleTree();


    }

    @Test
    void testIteratorIfTreeIsNotEmptyOneElement(){
        tree.insertLeafInTree("aaa",1);
        iterator=tree.iterator();
        String expected = "aaa";
        Assertions.assertEquals(expected,iterator.next());

    }
    @Test
    void testIteratorIfTreeIsNotEmptyFewElements(){
        tree.insertLeafInTree("aaa",1);
        tree.insertLeafInTree("bbb",1);
        tree.insertLeafInTree("ccc",1);
        iterator=tree.iterator();
        iterator.next();
        String expected = "aaa";
        Assertions.assertEquals(expected,iterator.next());

    }

    @Test
    void testIteratorIfTreeIsEmpty(){
        iterator=tree.iterator();
        Assertions.assertThrows(NoSuchElementException.class,()->iterator.next());

    }

}