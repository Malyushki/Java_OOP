package cardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rankOfCard = scanner.nextLine().toUpperCase();
        String suitOfCard = scanner.nextLine().toUpperCase();
        int powerOfCard = RankPowers.valueOf(rankOfCard).getPower() + SuitPowers.valueOf(suitOfCard).getPower();
        Card card = new Card(rankOfCard,suitOfCard,powerOfCard);
        System.out.println(card.toString());


    }
}
