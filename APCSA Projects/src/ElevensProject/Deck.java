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
	private int top;

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
	public Deck () {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 12; j ++) {
				int point = j;
				if (point > 10)
					point = 10;
				Card card = new Card (FACE[j], SUITS[i], point);
				cards.add(card);
			}
		}
		System.out.println(cards);
	}
	
	public String deaCard() {
		return "";
	}
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
	public String shuffle() {
		return "";
	}
   	//use Colletions.shuffle
   	//reset the top card 
}