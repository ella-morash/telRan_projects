package com.telran.pizzaService;

public abstract class Pizza {
    private String name;


    public Pizza(String name) {
        this.name = name;

    }

    public String getName() {
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
