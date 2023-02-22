package cardsWithPower_03;

public class Card {

    private String cardName;
    private String suitName;
    private int cardPower;

    public Card(String cardName, String suitName, int cardPower) {
        this.cardName = cardName;
        this.suitName = suitName;
        this.cardPower = cardPower;
    }

    public String getCardName() {
        return cardName;
    }

    public String getSuitName() {
        return suitName;
    }

    public int getCardPower() {
        return cardPower;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.getCardName(),this.getSuitName(),this.getCardPower());
    }
}
