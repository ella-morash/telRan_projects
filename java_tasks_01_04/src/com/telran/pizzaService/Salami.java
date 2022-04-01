package com.telran.pizzaService;

public class Salami extends Pizza{

    public Salami(Enum name) {
        super(name);
    }

    @Override
    public void preparing() {
        System.out.println("Adding salami and cheese");

    }

    @Override
    public void backing() {
        System.out.println(getName() + " is being backed");

    }

    @Override
    public void wrapping() {

        System.out.println(getName() + " is getting ready to send");

    }
}
