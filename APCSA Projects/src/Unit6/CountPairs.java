package Unit6;


import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		char letter = str.charAt(0);
		for (int i = 1; i<str.length(); i++) {
			if (str.charAt(i) == letter) {
				count ++;
			}
			letter = str.charAt(i);
		}
		return count;
	}
}