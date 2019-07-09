package Inheritance.P02_Zoo;

import Inheritance.P02_Zoo.zoo.*;

public class Main {
    public static void main(String[] args) {

        Lizard lizard = new Lizard("Gosho");
        Snake snake = new Snake("Ssssisi");
        Gorilla gorilla = new Gorilla("King Kong");
        Bear bear = new Bear("Teddy");

        System.out.println(lizard.getName());
        System.out.println(snake.getName());
        System.out.println(gorilla.getName());
        System.out.println(bear.getName());
    }
}
