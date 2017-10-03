package java_tutor.classes2;

/**
 * Created by user on 07.04.2017.
 */
public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                        card.rankToString(card.getRank()),
                        card.suitToString(card.getSuit()));
            }
        }
    }
}
