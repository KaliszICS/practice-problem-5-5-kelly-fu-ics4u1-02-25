public class Card implements Comparable<Card> {
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }

    @Override
    public int compareTo(Card other) {
        return getCardOrder(this) - getCardOrder(other);
    }

    private int getCardOrder(Card card) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        int rankIndex = -1, suitIndex = -1;

        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i].equals(card.name)) {
                rankIndex = i;
                break;
            }
        }

        for (int i = 0; i < suits.length; i++) {
            if (suits[i].equals(card.suit)) {
                suitIndex = i;
                break;
            }
        }

        return suitIndex * 13 + rankIndex;
    }
}
