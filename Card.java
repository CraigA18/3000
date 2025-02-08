// Class for the individual cards.
public class Card {

  String suit;
  String value;

  public Card(String value, String  suit) {
    this.suit = suit;
    this.value = value;
  }

  public String getSuit() {
    return suit;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString(){
    return value + " of " + suit;
  }
}
