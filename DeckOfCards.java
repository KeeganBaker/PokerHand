// DeckOfCards class represents a deck of 52 cards
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.security.SecureRandom;

public class DeckOfCards {
    // Random number generator
    private static final SecureRandom randomNumbers= new SecureRandom();

    // initializing number of cards in the deck, current card, and array of 52 cards 
    private static final int numberOfCards = 52;
    private int currentCard = 0;
    private Card[] deck = new Card[numberOfCards];

    // populate the Card array using a constructor
    public DeckOfCards() {
        String[] face = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
        "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suit = {"Diamonds", "Hearts", "Spades", "Clubs"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(face[count % 13], suit[count / 13]);
        }
    }

    // Method to shuffle the deck of cards
    public void shuffle() {
        // each time shuffle is called, reset the count
        this.currentCard = 0;

        // randomly selects a number and uses a temp card to swap each card with a random card
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(numberOfCards);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }


    // Method to deal one card
    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        }
        else {
            // won't return anything if all cards have been dealt
            return null;
        }
        
    }
}
