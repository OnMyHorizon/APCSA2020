package ElevensProject;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	public static String[] FACE = "ACE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE TEN JACK QUEEN KING".split(" ");
	private List<Card> cards;
	private Card top;
	private int size;
   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
	public Deck () {
		cards = new ArrayList<Card>();
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 12; j ++) {
				int point = j+1;
				if (point > 10)
					point = 10;
				cards.add(new Card (FACE[j], SUITS[i], point));
			}
		}
		size = cards.size();
		top = cards.get(size-1);
	}
	public boolean isEmpty() {
		if (cards.size() ==0)
			return true;
		return false;
	}
	public Card dealCard() {
		if (size < 0) {
			return null;
		}
		top = cards.get(size-1);
		size --;
		return top;
	}
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
	public List shuffle() {
		Collections.shuffle(cards);
		size = cards.size();
		return cards;
	}
   	//use Colletions.shuffle
   	//reset the top card 
}