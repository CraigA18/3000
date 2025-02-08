import java.util.*;
public class Deck {
  public ArrayList<Card> deck;
  public ArrayList<Card> discardPile;

  public Deck(){
    deck = new ArrayList<>();
    discardPile = new ArrayList<>();
  }

  public void createDeck() {
    String[] suit = {"Hearts","Spades","Clubs","Diamonds"};
    String[] value = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

  
    for (String s: suit){
      for (String v : value){
        deck.add(new Card(v, s));
      }
    }
  }
  
  public void shuffle(){
    Collections.shuffle(deck);
    System.out.println("Deck is now shuffled");
  }

  public void printDeck(){
    if (deck.isEmpty()){
      System.out.println("Deck is empty.");
    }
    else {
      for (Card card : deck){
        System.out.println(card);
      }
    }
  }
}
