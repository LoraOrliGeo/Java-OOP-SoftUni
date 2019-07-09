package WorkingWithAbstraction.P01_CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        Arrays.stream(Suits.values())
                .forEach(e -> System.out.println(String.format("Ordinal value: %d; Name value: %s",
                                                                e.ordinal(), e.name())));

//        for (int i = 0; i < Suits.values().length; i++) {
//            System.out.println(String.format("Ordinal value: %d; Name value: %s", i, Suits.values()[i]));
//        }
    }
}
