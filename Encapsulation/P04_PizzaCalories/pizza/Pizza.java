package Encapsulation.P04_PizzaCalories.pizza;

import Encapsulation.P04_PizzaCalories.Validator;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfToppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.validatePizzaName(name);
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfToppings) {
        Validator.validateNumberOfToppings(numberOfToppings);
        this.numberOfToppings = numberOfToppings;
    }

    public void addTopping(Topping topping) {
        if (this.toppings.size() < this.numberOfToppings) {
            this.toppings.add(topping);
        }
    }

    public double getOverallCalories() {
        double overallCalories = this.dough.calculateCalories();
        overallCalories += this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        return overallCalories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.name, this.getOverallCalories());
    }
}