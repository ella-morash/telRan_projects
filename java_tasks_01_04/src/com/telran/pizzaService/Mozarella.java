package com.telran.pizzaService;

public class Mozarella extends Pizza{

    public Mozarella(Enum name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding mozarella and tomatoes");

    }

}
