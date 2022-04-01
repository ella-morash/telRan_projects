package com.telran.pizzaService;

public class PizzaFactory {


    public static Pizza order(String name){
        switch (name) {
            case "Mozarella":
                return new Mozarella(name);
            case "Gawaii":
                return  new Gawaii(name);
            case "Salami":
                return new Salami(name);
        }
        return null;
    }
}
