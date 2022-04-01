package com.telran.pizzaService;

public abstract class Pizza {
    private Enum name;

    public Pizza(Enum name) {
        this.name = name;
    }

    public Enum getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
    public void orderPizza() {
        preparing();
        backing();
        wrapping();
    }

    protected abstract void preparing();

    private void backing() {
        System.out.println(getName()+" is being backed");
    };

    private void wrapping() {
        System.out.println(getName() + " is being wrapped");
    };



}
