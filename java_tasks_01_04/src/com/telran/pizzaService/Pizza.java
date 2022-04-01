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

    public abstract void preparing();

    public abstract void backing();

    public abstract void wrapping();



}
