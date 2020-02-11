package Unit6;


import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover lett = new LetterRemover();
		lett.setRemover("I am Sam I am", 'a');
		System.out.println(lett);
		System.out.println(lett.removeLetters()+"\n\n");
		
		lett.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(lett);
		System.out.println(lett.removeLetters()+"\n\n");
		
		lett.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(lett);
		System.out.println(lett.removeLetters()+"\n\n");
		
		lett.setRemover("abababababa", 'b');
		System.out.println(lett);
		System.out.println(lett.removeLetters()+"\n\n");
		
		lett.setRemover("abaababababa", 'x');
		System.out.println(lett);
		System.out.println(lett.removeLetters()+"\n\n");
	}
}