package Encapsulation.P04_PizzaCalories;

import java.util.Arrays;

public class Validator {

    public static void validatePizzaName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() < 1 || name.length() > 15) {
            throw new IllegalArgumentException("Encapsulation.P04_PizzaCalories.pizza.Pizza name should be between 1 and 15 symbols.");
        }
    }

    public static void validateNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public static void validateDoughWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Encapsulation.P04_PizzaCalories.pizza.Dough weight should be in the range [1..200].");
        }
    }

    public static void validateFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public static void validateBakingTechnique(String bakingTechnique) {
        String[] bakingTechniques = {"Crispy", "Chewy", "Homemade"};

        if (!Arrays.asList(bakingTechniques).contains(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public static void validateToppingType(String toppingType) {
        String[] toppings = {"Meat", "Veggies", "Cheese", "Sauce"};

        if (!Arrays.asList(toppings).contains(toppingType)) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    public static void validateToppingWeight(String toppingType, double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
    }
}