package com.company.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex",new Address("7th avenu",14));
        Person person2 = new Person("Jack",new Address("collar street",7));
        Person person3 = new Person("Trinity",new Address("wunkl alle",14));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(AddressCatalog.getListOfAddresses(personList));
    }
}
