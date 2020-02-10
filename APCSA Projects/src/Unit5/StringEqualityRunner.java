package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality str = new StringEquality("hello", "goodbye");
		str.setWords("hello","goodbye");
		str.checkEquality();
		
		str.setWords("one","two");
		str.checkEquality();
		
		str.setWords("three","four");
		str.checkEquality();
		
		str.setWords("TCEA","UIL");
		str.checkEquality();
		
		str.setWords("ABC","ABC");
		str.checkEquality();
		
		str.setWords("ABC","CBA");
		str.checkEquality();
		
		str.setWords("Same","Same");
		str.checkEquality();
		
	}
}