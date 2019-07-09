package WorkingWithAbstraction;

public class P02_CardRank {
    enum ranks {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        for (int i = 0; i < ranks.values().length; i++) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", i, ranks.values()[i]));
        }

    }
}