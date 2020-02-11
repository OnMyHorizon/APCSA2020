package Unit6;


import static java.lang.System.*;

public class Perfect
{
   private int number, sum;

	public Perfect () {
		
	}
	
	public Perfect (int num) {
		setNumber(num);
	}
	
	public void setNumber(int num) {
		number = num;
		sum = 0;
	}

	public boolean isPerfect()
	{
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		if (sum == number) {
			return number + " is perfect.";
		}
		return number+" is not perfect.";
	}
	
}