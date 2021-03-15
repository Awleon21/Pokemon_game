package Cards;

import java.util.*;

public class Deck {
    ArrayList<Card> innerDeck = new ArrayList<>();


    // Write a method that creates a deck of Cards (hint use Card Object)
    public Deck(){
        // add a card to innerDeck
        Card card = new Card("Spades", "3", 3);
        Card card2 = new Card("Diamonds", "Queen", 12);
        Card card3 = new Card("Hearts", "7", 7);
        Card card4 = new Card("Clubs", "9", 9);


        innerDeck.add(card);
        innerDeck.add(card2);
        innerDeck.add(card3);
        innerDeck.add(card4);
    }

    // Write a method to shuffle the deck
    public void shuffleDeck(){
        // enter code here
        //ArrayList<Card> shuffled = new ArrayList<>();
        Collections.shuffle(innerDeck, new Random());
       // double shuffle = Math.round(Math.random() * innerDeck.size());

    }

    // Write a method to print the deck
    public void printDeck() {
        // print the contents of the innerDeck array
        for (Card card : innerDeck) {
            System.out.println(card);
        }
    }
}

