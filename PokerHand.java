// Class containing five cards that make up a poker hand
// Can be called to show the hand, tell if it contains a pair, two pair, and/or three of a kind
////////////////////////////////////////////////////////////////////////////////////////////////////

public class PokerHand {
    private Card [] dealtCard = new Card[5];
    private int pairs = 0;

    // constructor will fill a new hand, and check for pairs, and three of a kind
    public PokerHand(DeckOfCards myDeck)
    {
        for (int count = 0; count < 5; count++) {
            dealtCard[count] = myDeck.dealCard();
        }

        // reset count of pairs
        this.pairs = 0;

        // embeded loop will check each card and determine if they are a pair
        for (int i = 0; i < 5; i++) {
            for (int b = 0; b < 5; b++){
                if (dealtCard[i].faceString() == dealtCard[b].faceString() && i != b) {
                    this.pairs++;
                }
            }
        }
    } 

    // Test Constructor
    // public PokerHand(Card a, Card b, Card c, Card d, Card e){
       
    //     this.dealtCard[0] = a;
    //     this.dealtCard[1] = b;
    //     this.dealtCard[2] = c;
    //     this.dealtCard[3] = d;
    //     this.dealtCard[4] = e;

    //     // reset count of pairs
    //     this.pairs = 0;

    //     // embeded loop will check each card and determine if they are a pair
    //     for (int i = 0; i < 5; i++) {
    //         for (int f = 0; f < 5; f++){
    //             if (dealtCard[i].faceString() == dealtCard[f].faceString() && i != f) {
    //                 this.pairs++;
    //             }
    //         }
    //     }
    // }

    // method will print out users hand
    public void ShowHand() {
        System.out.print("Your hand is: ");
        for (int count = 0; count < 5; count++) {
            if (count != 0) {
                System.out.print(", ");
            }
            System.out.print(dealtCard[count]);
        }
        System.out.println();
    }

    // method to return true or false if any pairs
    public Boolean Pair() {
        if (pairs != 0){
            return true;
        }
        else {
            return false;
        }
    }

    // method to return true or false if more than one pair
    public Boolean TwoPair(){
        if (pairs >= 4){
            return true;
        }
        else {
            return false;
        }
    }

    // method to return true or false if three of a kind
    public Boolean ThreeOfKind(){
        if (pairs >= 8){
            return true;
        }
        else {
            return false;
        }
    }
}
