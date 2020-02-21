package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int temp;
		for (int i =1; i <= numArray.length -1; i++) {
			temp = numArray[i-1];
			if (temp <= numArray[i]) {
				return false;
			}
		}
		return true;
	}	
}