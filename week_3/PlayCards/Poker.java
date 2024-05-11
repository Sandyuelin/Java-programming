// hahahahahah
// setting array values at compile time
public class Poker {
    public static void main(String[] args){
        String [] SUITS = {
                "Clubs" , "Diamonds" , "Hearts" , "Spades"
        };
        String [] RANKS = {
                "2","3","4","5","6","7", "8","9","10","Jack", "Queen","King","Ace"
        };
        int i = (int) (Math.random() * RANKS.length);
        int j = (int) (Math.random() * SUITS.length);
        System.out.println(RANKS[i]+ " of " + SUITS[j]);
    }
}
