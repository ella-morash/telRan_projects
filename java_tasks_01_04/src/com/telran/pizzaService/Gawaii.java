package com.telran.pizzaService;

public class Gawaii extends Pizza{

    public Gawaii(Enum name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding chicken and peperoni");

    }


}
