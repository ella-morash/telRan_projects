package com.telran.pizzaService;

public class PizzaFactory {

    public static Pizza order(Enum name){
        if (Pizzas.MOZARELLA.equals(name)) {
            return new Mozarella(name);
        } else if (Pizzas.GAWAII.equals(name)) {
            return new Gawaii(name);
        } else if (Pizzas.SALAMI.equals(name)) {
            return new Salami(name);
        }
        return null;
    }
}
