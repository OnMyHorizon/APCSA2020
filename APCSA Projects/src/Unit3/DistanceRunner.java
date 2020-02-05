package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance Distance = new Distance(0,0,0,0);
		Distance.setCoordinates(1,1,2,1);
		Distance.calcDistance();
		System.out.println(Distance);
		Distance.setCoordinates(1,1,-2,2);
		Distance.calcDistance();
		System.out.println(Distance);
		Distance.setCoordinates(1,1,0,0);
		Distance.calcDistance();
		System.out.println(Distance);
	}
}