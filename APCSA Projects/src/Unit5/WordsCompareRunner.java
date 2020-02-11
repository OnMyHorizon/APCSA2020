package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare comp = new WordsCompare();
	   comp.setWords("abe", "ape");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("giraffe", "gorilla");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("one", "two");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("fun", "funny");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("123", "19");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("193", "1910");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("goofy", "godfather");
	   comp.compare();
	   System.out.println(comp);
	   
	   comp.setWords("funnel", "fun");
	   comp.compare();
	   System.out.println(comp);
	}
}