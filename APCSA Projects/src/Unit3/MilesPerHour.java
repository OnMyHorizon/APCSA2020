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

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph = 0;

	public MilesPerHour()
	{
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		if (minutes != 0 && hours != 0) {
		mph = distance/(hours + minutes/60);
		}
		else if (minutes == 0 && hours != 0) {
			mph = distance/hours;
		}else {
			mph = distance/(minutes/60);
		}
		
	}	
	public String toString()
	{
		return ""+(int)distance +" miles in "+(int)hours+" hours and "+(int)minutes+" minutes= "+Math.round(mph)+" miles per hour.";
	}
}