package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int low = 0;
		if (a<b && a<c) {
			low = a;
		}
		if (b<a && b<c) {
			low = b;
		}
		if (c<a && c<b) {
			low = c;
		}
		

        for (int i = low; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                for (int j = i; j > 0; j--) {
                    if ((i % j == 0) && (c % j == 0)) {
                        return j;
                    }
                }
            }
        }
		return 1;
	}
	private boolean evenOrOdd(int a, int b) {
		return (((a % 2) == 1) && ((b % 2) == 0));
	}
	private String triplesChecker() {
		String output="";
		for (int a = 1; a <= number; a++) {
            for (int b = a + 1; b <= number; b++) {
                for (int c = b + 1; c <= number; c++) {
                    if ((a*a) + (b*b) == (c*c)) {
                        if (evenOrOdd(a, b) == true || evenOrOdd(b, a) == true) {
                        	if (greatestCommonFactor(a, b, c) == 1) {
                        		output += "" + a + " " + b + " " + c + "\n";
                        	}
                        }
                    }
                }
            }
        }
		return output;
	}
	public String toString()
	{
		return triplesChecker();
	}
}