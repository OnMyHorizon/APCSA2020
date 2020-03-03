package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot > -1 && spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int temp = pups[0].getAge();
		String tempName = pups[0].getName();
		for (int i = 0; i<= pups.length -1; i++) {
			if (pups[i].getAge() > temp) {
				temp = pups[i].getAge();
				tempName = pups[i].getName();
			}
		}
		return tempName;
	}

	public String getNameOfYoungest()
	{
		int temp = pups[0].getAge();
		String tempName = pups[0].getName();
		for (int i = 0; i<= pups.length-1; i++) {
			if (pups[i].getAge() < temp) {
				temp = pups[i].getAge();
				tempName = pups[i].getName();
			}
		}
		return tempName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}