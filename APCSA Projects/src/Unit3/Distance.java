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
	static int xOne,yOne,xTwo,yTwo;
	static double distance;

	public Distance(int x1, int y1, int x2, int y2)
	{
	}
	

	public static void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public static void calcDistance()
	{
		distance = Math.sqrt(((xTwo-xOne)*(xTwo-xOne)) +((yTwo-yOne)*(yTwo-yOne)));
	}
	
	public static void print()
	{
		System.out.println("\nX1: "+ xOne + "\nX2: "+ xTwo + "\nY1: "+ yOne +"\nY2: "+yTwo);
		System.out.printf("Distance: " + distance+"\n");
	}
}