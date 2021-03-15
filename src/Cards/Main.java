package Cards;

public class Main {
    // Update the Card Object and Deck Object to be able to run the below program!
    public static void main(String[] args){
        System.out.println("My deck of cards Application");
        // create deck
        Deck deck1 = new Deck();
        System.out.println("Deck prior to shuffle: ");
        deck1.printDeck();
        deck1.shuffleDeck();
        System.out.println("Deck after shuffle: ");
        deck1.printDeck();
    }
}
