import java.util.*;

public class Main {
    private static List <Card> deck = new ArrayList<>();
    public static void main(String[] args) {
        for (Ranks rank : Ranks.values()) {
            for (Suits suit : Suits.values()) {
                deck.add(new Card(suit,rank));
            }
        }
        Collections.shuffle(deck);
        for (Card card : deck) System.out.println(card);
        while (deck.size() > 0) {
            System.out.println("\n" + "Нажмите Enter");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.out.println("Карта: " + deck.get(0));
            deck.remove(0);
        }
        System.out.println("\n" + "Колода закончилась!");
    }
}
