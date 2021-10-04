enum Suits{
    DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES
}
enum Ranks {
    ACE,
    JACK,
    QUEEN,
    KING
}

//diamonds (♦), clubs (♣), hearts (♥) and spades (♠)

class Card {

    private Suits suit;
    private Ranks rank;

    Card(Suits suit, Ranks rank){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {

        return getName(this.rank) + " " + getIcon(this.suit);
    }

    private final static String getName(Ranks rank){
        return switch (rank) {
            case ACE -> "Туз";
            case JACK -> "Валет";
            case QUEEN -> "Дама";
            case KING -> "Король";
        };
    }


  private final static String getIcon(Suits suit) {
      return switch (suit){
          case CLUBS -> "(♣)";
          case DIAMONDS -> "(♦)";
          case HEARTS -> "(♥)";
          case SPADES -> "(♠)";
          default -> "Такой масти нет";

      };
  }
}
