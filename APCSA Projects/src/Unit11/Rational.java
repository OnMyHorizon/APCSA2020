package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	public int numerator =1;
	public int denominator = 1;
	//write two constructors
	public Rational() {
		
	}
	public Rational(int num, int den) {
		numerator = num;
		denominator = den;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int numOne) {
		numerator = numOne;
	}
	public void setDenominator(int numTwo) {
		denominator = numTwo;
	}
	//write a setRational method
	public void setRational (int numOne, int numTwo) {
		setNumerator(numOne); 
		setDenominator(numTwo);
	}

	//write  a set method for numerator and denominator

	
	public void add(Rational  otherNumber)
	{
		 this.setNumerator( (this.getNumerator() * otherNumber.denominator ) + (this.getDenominator() * otherNumber.numerator));
		 this.setDenominator( this.getDenominator() * otherNumber.denominator );
		reduce();
	}

	private void reduce()
	{
		int num = gcd(numerator, denominator);
		numerator = numerator/num;
		denominator = denominator/num;
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int x = min; x>1; x--) {
			if (numOne % x == 0 && numTwo % x == 0) {
				return x;
			}
		}

		return 1;
	}

	public Object clone ()
	{
		return new Rational(getNumerator(), getDenominator());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		if (this.compareTo((Rational)obj) == 0){
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		Rational num1 = new Rational(numerator, denominator);
	    Rational num2 = new Rational(other.getNumerator(), other.getDenominator());
	    num1.reduce();
	    num2.reduce();
	    if (num1.getDenominator() < num2.getDenominator()) {
	      return -1;
	    } else if (num1.getDenominator() == num2.getDenominator()) {
	      if (num1.getNumerator() < num2.getNumerator()) {
	        return -1;
	      } else if (num1.getNumerator() > num2.getNumerator()) {
	        return 1;
	      } else {
	        return 0;
	      }
	    } else {
	      return 1;
	    }
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
	//write  toString() method
	
	
}