package java_tutor.classes2;

/**
 * Created by user on 07.04.2017.
 */
public class Deck {

    public static int numSuits = Suits.values().length;
    public static int numRanks = Ranks.values().length;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                cards[suit.ordinal()][rank.ordinal()] = new Card(rank, suit);
            }
        }

    }

    public Card getCard(Suits suit, Ranks rank) {
        return cards[suit.ordinal()][rank.ordinal()];
    }
}