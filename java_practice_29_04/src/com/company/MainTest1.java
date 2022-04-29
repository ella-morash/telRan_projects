package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MainTest1 {
    @Test
    void maxElementNormalCase(){
        int[] input ={1,8,7,3};
        int expected = 8;
        Assertions.assertEquals(expected,Main.getMaxElement(input));


    }
    @Test
    void maxElementIfTwoMax(){
        int[] input ={1,8,7,8,3};
        int expected = 8;
        Assertions.assertEquals(expected,Main.getMaxElement(input));


    }

    @Test
    void maxElementIfArrayIsEmpty(){
        int[] input =null;
        int expected = 0;
        Assertions.assertEquals(expected,Main.getMaxElement(input));


    }

}