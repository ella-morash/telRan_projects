package com.telran.pizzaService;

import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        System.out.println("What kind of pizza would you like to order? \n Enter: \n Mozarella \n Gawaii \n Salami " );
        String answer = order.next();
        Pizza newOrder = PizzaFactory.order(answer);
        newOrder.preparing();
        newOrder.backing();
        newOrder.wrapping();

    }
}
