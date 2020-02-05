package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	
	public Distance() 
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}
	

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(((xTwo-xOne)*(xTwo-xOne)) +((yTwo-yOne)*(yTwo-yOne)));
	}
	
	public String toString() {
		String  distanceF = String.format("%.3f", distance );
		return ("\nX1:: "+ xOne + "\nX2:: "+ xTwo + "\nY1:: "+ yOne +"\nY2:: "+yTwo+ "\n" +"Distance == " + distanceF+"\n");
	}
}