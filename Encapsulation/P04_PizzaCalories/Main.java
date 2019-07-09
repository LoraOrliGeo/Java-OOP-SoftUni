package Encapsulation.P04_PizzaCalories;

import Encapsulation.P04_PizzaCalories.pizza.Dough;
import Encapsulation.P04_PizzaCalories.pizza.Pizza;
import Encapsulation.P04_PizzaCalories.pizza.Topping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] pizzaTokens = sc.nextLine().split("\\s+");
            String pizzaName = pizzaTokens[1];
            int numberOfToppings = Integer.parseInt(pizzaTokens[2]);

            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            String[] doughTokens = sc.nextLine().split("\\s+");
            String flourType = doughTokens[1];
            String bakingTechnique = doughTokens[2];
            double doughWeight = Double.parseDouble(doughTokens[3]);

            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);

            pizza.setDough(dough);

            String line = "";

            while (!"END".equals(line = sc.nextLine())) {
                String[] toppingTokens = line.split("\\s+");
                String toppingType = toppingTokens[1];
                double toppingWeight = Double.parseDouble(toppingTokens[2]);

                Topping topping = new Topping(toppingType, toppingWeight);

                pizza.addTopping(topping);
            }

            System.out.println(pizza.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}