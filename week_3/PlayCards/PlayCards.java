public class PlayCards {
    public static void main(String[] args){
        String [] SUITS = {
                "Clubs" , "Diamonds" , "Hearts" , "Spades"
        };
        String [] RANKS = {
                "2","3","4","5","6","7", "8","9","10","Jack", "Queen","King","Ace"
        };
        String[] deck = new String[RANKS.length* SUITS.length];
        for (int i = 0; i < RANKS.length; i++)
            for (int j = 0; j < SUITS.length; j++){
                deck[SUITS.length* i + j] = RANKS[i] + " of " + SUITS[j];
                System.out.println(RANKS[i] + " of " + SUITS[j] );
            }
    }
}
// what i learned: the scope of the variables i and j is limited to the lopps in which they are defined
// im trying to access the two outside their loops, which is causing the compilation error because they are unknown in that context