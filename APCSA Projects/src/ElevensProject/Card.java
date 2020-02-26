package ElevensProject;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
	private String cardSuit;
	private String value;
	private int point;
	
  	//constructors
	public Card(String faceValue, String suit, int points) {
		cardSuit = suit;
		value = faceValue;
		point = points;
	}

	// modifiers
		//set methods
	public void setFace(int faceValue) {
		value = FACES[faceValue];
	}
	public void setSuit(String suit) {
		cardSuit = suit;
	}
	public void setPoints(int points) {
		point = points;
	}


  	//accessors
		//get methods
	public String getFace() {
		return value;
	}
	public String getSuit() {
		return cardSuit;
	}
	public int getPoints() {
		return point;
	}
	
	public boolean equal(Card other) {
		if ((this.cardSuit == other.cardSuit) && (this.value == other.value) && (this.point == other.point)) {
			return true;
		}
		return false;
	}


  	//toString
	public String toString() {
		return value + " of " + cardSuit + " Point value: " + point;
	}

 }