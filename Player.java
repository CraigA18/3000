import java.util.*;
public class Player {

  public String name;
  public int points;
  public ArrayList<Card> hand;

  public Player(String n, int p){
    this.name = n;
    this.points = p;
    hand = new ArrayList<>();
  }

  public String getName(){
    return name;
  }

  public int getPoints() {
    return points;
  }

  public void getHand(){
      if (hand.isEmpty()){
        System.out.println("Hand is empty.");
      }
      else {
        for (Card card : hand){
          System.out.println(card);
        }
      }
  }

  public Card draw(Deck deck){
    if (deck.deck.isEmpty()){
      System.out.println("Deck is empty");
      return null;
    }
    else {
      Card card = deck.deck.remove(deck.deck.size()-1);
      System.out.println("You drew " + card.toString());
      hand.add(card);
      return card;
    }
  }

  public Card drawDiscard(Deck deck){
    if (deck.deck.isEmpty()){
      System.out.println("Discard Deck is empty");
      return null;
    }
    else {
      int x = 0;
      for (Card card : hand){
        System.out.print(x + ". ");
        System.out.println(card);
      }
      System.out.println("Choose a card to select. You will take all the cards to the left of the card");
      return null;
    }
  }

  public void removeCard(Deck deck){
    if (hand.isEmpty()){
      System.out.println("No cards in hand");
      return;
    }
    else {
      getHand();
      System.out.println("Enter card to remove");
      Scanner scan = new Scanner(System.in);

      String cardName = scan.nextLine();

      for (Card card : hand){
        if (card.toString().equalsIgnoreCase(cardName)){
          hand.remove(card);
          deck.deck.add(card);
          System.out.println("You removed " + card);
          return;
        }
      }
      scan.close();
    }
  }

  public String makePoints(String w){
    for (Card card : hand){
      String value = card.getValue();
      if (card.getValue().equals("Ace")){
        points+=100;
      }
      else if (Set.of("Jack","Queen","King","10").contains(value)){
        points+=10;
      }
      else {
        points+=5;
      }
    }
    return name + " has " + points + " points.";
  }

  // Run is a run of 3 numbers in sequentially increasing order ie 6,7,8 or J,Q,K
  

  @Override
  public String toString(){
    return name + " " + points;
  }
}
