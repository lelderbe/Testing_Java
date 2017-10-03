package java_tutor.classes2;

/**
 * Created by user on 07.04.2017.
 */
public class Card {

    private final Ranks rank;
    private final Suits suit;

    public Card(Ranks rank, Suits suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public static boolean isValidRank(Ranks rank) {
        return true; //ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuit(Suits suit) {
        return true; //DIAMONDS <= suit && suit <= SPADES;
    }

    public static String rankToString(Ranks rank) {
        switch (rank) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                //Handle an illegal argument.  There are generally two
                //ways to handle invalid arguments, throwing an exception
                //(see the section on Handling Exceptions) or return null
                return null;
        }
    }

    public static String suitToString(Suits suit) {
        switch (suit) {
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        // must run program with -ea flag (java -ea ..) to
        // use assert statements
        assert rankToString(Ranks.ACE) == "Ace";
        assert rankToString(Ranks.DEUCE) == "Deuce";
        assert rankToString(Ranks.THREE) == "Three";
        assert rankToString(Ranks.FOUR) == "Four";
        assert rankToString(Ranks.FIVE) == "Five";
        assert rankToString(Ranks.SIX) == "Six";
        assert rankToString(Ranks.SEVEN) == "Seven";
        assert rankToString(Ranks.EIGHT) == "Eight";
        assert rankToString(Ranks.NINE) == "Nine";
        assert rankToString(Ranks.TEN) == "Ten";
        assert rankToString(Ranks.JACK) == "Jack";
        assert rankToString(Ranks.QUEEN) == "Queen";
        assert rankToString(Ranks.KING) == "King";

        assert suitToString(Suits.DIAMONDS) == "Diamonds";
        assert suitToString(Suits.CLUBS) == "Clubs";
        assert suitToString(Suits.HEARTS) == "Hearts";
        assert suitToString(Suits.SPADES) == "Spades";

        for (Suits suit : Suits.values()) {
            System.out.println(suit.ordinal());
        }


    }
}