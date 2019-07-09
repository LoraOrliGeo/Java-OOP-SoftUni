package Encapsulation.P03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        name = name.replaceAll("\\s+", "");
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        if (this.getMoney() - product.getCost() >= 0) {
            this.money -= product.getCost();
            this.products.add(product);
            System.out.println(this.getName() + " bought " + product.getName());
        } else {
            String e = String.format("%s can't afford %s",
                    this.getName(), product.getName());
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + " - ");

        if (!this.products.isEmpty()) {
            for (Product product : this.products) {
                sb.append(product.getName() + ", ");
            }
            return sb.toString().substring(0, sb.toString().length() - 2);
        } else {
            sb.append("Nothing bought");
            return sb.toString();
        }
    }
}