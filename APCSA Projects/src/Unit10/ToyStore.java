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
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	public ToyStore (String toys) {
		toyList = new ArrayList<Toy>();
		loadToys(toys);
	}
	public void loadToys( String toys )
	{
		String[] toyNames = toys.split(" ");
		for(String name: toyNames){
			boolean toyInList = false;
			for(Toy toy: toyList)
				if( toy.getName().equals(name) ) {
					toy.setCount(toy.getCount() + 1);
					toyInList = true;
				}
				if(toyInList == false) {
					toyList.add( new Toy(name) );
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