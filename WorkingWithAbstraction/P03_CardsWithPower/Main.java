package WorkingWithAbstraction.P03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rank = sc.nextLine();
        String suit = sc.nextLine();

        int rankPower = Rank.valueOf(rank).getRankPower();
        int suitPower = Suit.valueOf(suit).getSuitPower();

        System.out.println(String.format("Card name: %s of %s; Card power: %d",
                rank, suit, rankPower + suitPower));
    }
}
