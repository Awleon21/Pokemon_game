package Cards;
public class Card {
    String suit;
    String rank;
    int value;
    // create the card class and constructors
    public Card(){

    }
    public Card(String suit, String rank, int value){
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    // enter code here
    public String toString(){
        return this.value + " " + this.suit + " " + this.rank;
    }
}

