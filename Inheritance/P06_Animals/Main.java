package Inheritance.P06_Animals;

import Inheritance.P06_Animals.animals.*;

public class Main {
    public static void main(String[] args) {

        Animal kitty = new Kitten("Rex", 5);
        System.out.println(kitty.toString());
    }
}
