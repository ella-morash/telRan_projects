package com.telran.pizzaService;

public class Salami extends Pizza{

    public Salami(String name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding salami and cheese");

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
