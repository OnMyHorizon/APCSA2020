package Unit6;


import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		TriangleOne tri = new TriangleOne();
		tri.setWord("hippo");
		tri.print();
		
		tri.setWord("abcd");
		tri.print();
		
		tri.setWord("it");
		tri.print();
		
		tri.setWord("a");
		tri.print();
		
		tri.setWord("chicken");
		tri.print();
	}
}