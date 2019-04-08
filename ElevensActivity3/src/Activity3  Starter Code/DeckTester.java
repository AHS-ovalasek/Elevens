/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
                int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
                String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
                
                Deck one = new Deck(ranks, suits, points);
                Deck two = new Deck(ranks, suits, points);
                Deck three = new Deck(ranks, suits, points);
                
                for(int x = 0; x < ranks.length*suits.length; x++){
                     System.out.println(one.deal());
                }
                
                
                
	}
       
}
