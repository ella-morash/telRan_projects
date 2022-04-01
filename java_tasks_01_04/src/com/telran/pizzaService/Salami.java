package com.telran.pizzaService;

public class Salami extends Pizza{

    public Salami(Enum name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding salami and cheese");

    }


}
