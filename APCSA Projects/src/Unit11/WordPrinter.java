package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printWord(String word, int times)
	{
		for (int i = times; i> 0; i--) {
			System.out.println(word);
		}
	}
}