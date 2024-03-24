// Card class represents one playing card
////////////////////////////////////////////////////////////////////////////////////////////////////

public class Card {
    private String face; 
    private String suit;

    // Two argument constructor to initialize the face and suit
    public Card (String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    // returns a string when the Card object is called as a string
    public String toString() {
        return face + " of " + suit;
    }

    public String faceString(){
        return face;
    }
}