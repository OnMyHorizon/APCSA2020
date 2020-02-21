package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char temp = letter;
		//row
		for (int i = 0; i < amount; i++){
			//char setting
			for (int j = 0; j < (amount - i); j++){
				//start
				if (j == 0)
					temp = letter;
				//if letter is z
				else if (temp == 'Z' && j > 0)
					temp = 'A';
				//change letter
				else
					temp++;
				//adding to string updated character
				for (int k = 0; k < (amount - j); k++)
					output += temp;
				//spaces after each char set
				output += " ";
			}
			//space after each line
			output += "\n";
		}
		return output;
	}
}