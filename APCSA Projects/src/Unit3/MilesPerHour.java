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
	//define these as doubles so you can divide by 60 later, otherwise you'll get the you can't divide by 0 error
	private double distance, hours, minutes;
	private double mph = 0;
	public MilesPerHour(int dist, int hrs, int mins){
	}

	public void setNums(int dist, int hrs, int mins){
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH(){
		mph = distance/(hours + minutes/60);	
	}	
	public String toString(){
		return ""+(int)distance +" miles in "+(int)hours+" hours and "+(int)minutes+" minutes = "+Math.round(mph)+" MPH.";
	}
}