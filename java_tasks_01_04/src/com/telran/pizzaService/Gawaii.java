package com.telran.pizzaService;

public class Gawaii extends Pizza{

    public Gawaii(Enum name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding chicken and peperoni");

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
