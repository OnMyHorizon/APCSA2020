package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	ArrayList<Toy> toyList;
	int sorryCt =1;
	int batCt = 1;
	int trainCt =1;
	int teddyCt = 1;
	int ballCt = 1;
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	public ToyStore (String toys) {
		loadToys(toys);
	}
	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toyss = new ArrayList<>(Arrays.asList(toys.split(" ")));
		for(int i = 0; i <= toyss.size()-1; i++)
		{
			String name = toyss.get(i);
			Toy t = new Toy(name);
			if (getThatToy(name) == null)
			{
				toyList.add(t);
			}
			else
			{
				if(t.getName().equals("sorry")) {
					sorryCt ++;
					t.setCount(sorryCt);
				}
				else if(t.getName().equals("bat")) {
					batCt ++;
					t.setCount(batCt);
				}
				else if(t.getName().equals("train")) {
					trainCt ++;
					t.setCount(trainCt);
				}
				else if(t.getName().equals("teddy")) {
					teddyCt ++;
					t.setCount(teddyCt);
				}
				else if(t.getName().equals("ball")) {
					ballCt ++;
					t.setCount(ballCt);
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
		double max = Integer.MIN_VALUE;
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		return toyList.toString();
	}
}