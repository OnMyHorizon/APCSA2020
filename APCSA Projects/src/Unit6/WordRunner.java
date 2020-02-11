package Unit6;


import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Word wrd = new Word();
		wrd.setString("Hello");
		System.out.println(wrd.getFirstChar());
		System.out.println(wrd.getLastChar());
		System.out.println(wrd.getBackWards());
		System.out.println(wrd);
		
		wrd.setString("World");
		System.out.println(wrd.getFirstChar());
		System.out.println(wrd.getLastChar());
		System.out.println(wrd.getBackWards());
		System.out.println(wrd);
		
		wrd.setString("Jukebox");
		System.out.println(wrd.getFirstChar());
		System.out.println(wrd.getLastChar());
		System.out.println(wrd.getBackWards());
		System.out.println(wrd);
		
		wrd.setString("TCEA");
		System.out.println(wrd.getFirstChar());
		System.out.println(wrd.getLastChar());
		System.out.println(wrd.getBackWards());
		System.out.println(wrd);
		
		wrd.setString("UIL");
		System.out.println(wrd.getFirstChar());
		System.out.println(wrd.getLastChar());
		System.out.println(wrd.getBackWards());
		System.out.println(wrd);
	}
}