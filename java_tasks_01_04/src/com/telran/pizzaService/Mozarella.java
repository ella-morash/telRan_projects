package com.telran.pizzaService;

public class Mozarella extends Pizza{

    public Mozarella(String name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding mozarella and tomatoes");

    }

    @Override
    public void backing() {
        System.out.println(getName() + " is backing");

    }

    @Override
    public void wrapping() {
        System.out.println(getName() + " is getting ready to send");

    }
}
