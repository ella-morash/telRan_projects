package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

class MainTest {


    @Test
    void testGetTeeMap() {

        // auto1 -> Volvo, c60, 50000
        // auto2 -> Mercedes, bmers600, 60000
        // auto3 -> Mercedes, amers600, 40000
        // auto4 -> Volvo, c60, 10000
        //Mercedes - [auto3,auto2]
        //Volvo - [auto4,auto1]
        Car car1 = new Car("Volvo","c60",50000);
        Car car2 = new Car("Mercedes","bmers600",60000);
        Car car3 = new Car("Mercedes","amers600",40000);
        Car car4 = new Car("Volvo","c60",10000);

        List<Car> cars = Arrays.asList(car1,car2,car3,car4);
        TreeMap<String, TreeSet<Car>> treeMap = new TreeMap<>();
        treeMap.put("Mercedes",new TreeSet<>(new ComparatorByModel()));
        treeMap.get("Mercedes").add(car3);
        treeMap.get("Mercedes").add(car2);
        treeMap.put("Volvo",new TreeSet<>(new ComparatorByModel()));
        treeMap.get("Volvo").add(car4);
        treeMap.get("Volvo").add(car1);

        Assertions.assertEquals(treeMap,Main.getTreeMapOfCars(cars));

    }

}