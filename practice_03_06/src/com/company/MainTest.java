package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MainTest {
    @Test
    void testMaxOccurEl(){
        List<Integer> numbers = Arrays.asList(1, 5, -10, 5, 1,5);
        Assertions.assertEquals(5,Main.findMaxOccuredElt(numbers));

    }
    @Test
    void testSingleEl(){
        List<Integer> numbers = Arrays.asList(1, 5, -10, 5, 1,5);
        Assertions.assertEquals(-10,Main.findSingleNumber(numbers));

    }

}