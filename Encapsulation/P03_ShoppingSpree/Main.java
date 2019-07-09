package Encapsulation.P03_ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] people = sc.nextLine().split(";");

        Map<String, Person> peopleInfo = new HashMap<>();
        Map<String, Product> productsInfo = new HashMap<>();

        for (String element : people) {
            String[] personData = element.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try{
                Person person = new Person(name, money);
                peopleInfo.put(person.getName(), person);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] products = sc.nextLine().split(";");

        for (String element : products) {
            String[] productData = element.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try{
                Product product = new Product(name, cost);
                productsInfo.put(product.getName(), product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String line = "";

        while(!"END".equals(line = sc.nextLine())){
            String[] tokens = line.split("\\s+");
            String person = tokens[0];
            String product = tokens[1];

            try {
                peopleInfo.get(person).buyProduct(productsInfo.get(product));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        for (Person person : peopleInfo.values()) {
            System.out.println(person);
        }

    }
}