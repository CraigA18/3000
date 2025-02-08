// Game file to start the game, rules, and creation and ending of the game 
public class Game {
  public static void main (String[] args){
  Player alex = new Player("Alex", 0);
  Deck deck = new Deck();
  Deck discardDeck = new Deck();

  deck.createDeck();
  alex.draw(deck);
  alex.draw(deck);
  alex.removeCard(discardDeck);
  alex.getHand();
  System.out.println(alex.drawDiscard(discardDeck));
  }
}