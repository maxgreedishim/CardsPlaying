import java.util.*;

public class Main {
    private static List <Card> deck = new ArrayList<>();
    private static final String [] arrayCard = new String[deck.size()];
    static {
        for (Ranks rank : Ranks.values()) {
            for (Suits suit : Suits.values()) {
                deck.add(new Card(suit,rank));
            }
        }
        Collections.shuffle(deck);
        for (Card card : deck) System.out.println(card);
        dealCards();
    }
    private static void dealCards() {
         while (deck.size() != 0) {
            System.out.println("\n" + "Нажмите Enter");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.out.println("Карта: " + deck.get(arrayCard.length));
            deck.remove(deck.get(arrayCard.length));
        }
        if (deck.size() == 0) System.out.println("\n" + "Колода закончилась!");
    }

    public static void main(String[] args) {

    }
}
