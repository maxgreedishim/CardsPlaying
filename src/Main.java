import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Card> deck = new ArrayList<>();
    static {
        for (Ranks rank : Ranks.values()) {
            for (Suits suit : Suits.values()) {
                deck.add(new Card(suit,rank));
            }
        }
        Collections.shuffle(deck);
        for (Card card : deck) System.out.println(card);
    }


    public static void main(String[] args) {

    }
}
