// Name: Keegan Baker
// Date: 01 19 2024
// Project: CS 145 
// Purpose: Output a hand of five cards and differentiate wether the hand contains a pair, two 
//          pairs, and three of a kind (Excersie 7.16 from Java How to Program by Detiel & Deitel)
////////////////////////////////////////////////////////////////////////////////////////////////////

public class Lab2Test {
    public static void main(String[] args) throws Exception {

        // Creates and shuffles a new deck each time the program is run
        DeckOfCards myDeck = new DeckOfCards();
        myDeck.shuffle();

        // Create a new poker hand object and print. 
        PokerHand myPokerHand = new PokerHand(myDeck);
        // PokerHand myPokerHand = new PokerHand(
        // new Card("Ace", "Hearts"), 
        // new Card("Seven", "Diamonds"), 
        // new Card("Two", "Hearts"), 
        // new Card("King", "Spades"), 
        // new Card("Three", "Clubs")  
        // );

        // Will print out what users hand is
        myPokerHand.ShowHand();

        // methods to tell pair, two pair, or three of a kind
        System.out.println("Contains a pair: \t\t" + myPokerHand.Pair());
        System.out.println("Contains two pairs: \t\t" + myPokerHand.TwoPair());
        System.out.println("Contains three of a kind: \t" + myPokerHand.ThreeOfKind() + "\n");
    }
}
