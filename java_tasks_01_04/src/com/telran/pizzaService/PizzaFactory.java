package com.telran.pizzaService;

public class PizzaFactory {


    public static Pizza order(Enum name){
        if (Pizzas.Mozarella.equals(name)) {
            return new Mozarella(name);
        } else if (Pizzas.Gawaii.equals(name)) {
            return new Gawaii(name);
        } else if (Pizzas.Salami.equals(name)) {
            return new Salami(name);
        }
        return null;
    }
}
