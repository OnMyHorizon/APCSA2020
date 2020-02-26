package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.*;
public class DownRunner
{
	public static void main( String args[] )
	{
		List<Integer> numlist = new ArrayList<Integer>();
 		int [] value = new int [] {-99,1,2,3,4,5,6,7,8,9,10,12345};
		for (int s: value) {
			numlist.add(s);
		}
		System.out.println(ListDown.go(numlist));
		
		List<Integer> numlist1 = new ArrayList<Integer>();
 		value = new int [] {10,9,8,7,6,5,4,3,2,1,-99};
		for (int s: value) {
			numlist1.add(s);
		}
		System.out.println(ListDown.go(numlist1));
		
		List<Integer> numlist2 = new ArrayList<Integer>();
 		value = new int [] {10,20,30,40,50,-11818,40,30,20,10};
		for (int s: value) {
			numlist2.add(s);
		}
		System.out.println(ListDown.go(numlist2));
		
		List<Integer> numlist3 = new ArrayList<Integer>();
 		value = new int [] {32767};
		for (int s: value) {
			numlist3.add(s);
		}
		System.out.println(ListDown.go(numlist3));
		
		List<Integer> numlist4 = new ArrayList<Integer>();
 		value = new int [] {255,255};
		for (int s: value) {
			numlist4.add(s);
		}
		System.out.println(ListDown.go(numlist4));
		
		List<Integer> numlist5 = new ArrayList<Integer>();
 		value = new int [] {9,10,-88,100,-555,1000};
		for (int s: value) {
			numlist5.add(s);
		}
		System.out.println(ListDown.go(numlist5));
		
		List<Integer> numlist6 = new ArrayList<Integer>();
 		value = new int [] {10,10,10,11,456};
		for (int s: value) {
			numlist6.add(s);
		}
		System.out.println(ListDown.go(numlist6));
		
		List<Integer> numlist7 = new ArrayList<Integer>();
 		value = new int [] {-111,1,2,3,9,11,20,30};
		for (int s: value) {
			numlist7.add(s);
		}
		System.out.println(ListDown.go(numlist7));
		
		List<Integer> numlist8 = new ArrayList<Integer>();
 		value = new int [] {9,8,7,6,5,4,3,2,0,-2,-989};
		for (int s: value) {
			numlist8.add(s);
		}
		System.out.println(ListDown.go(numlist8));
		
		List<Integer> numlist9 = new ArrayList<Integer>();
 		value = new int [] {12,15,18,21,23,1000};
		for (int s: value) {
			numlist9.add(s);
		}
		System.out.println(ListDown.go(numlist9));
		
		List<Integer> numlist10 = new ArrayList<Integer>();
 		value = new int [] {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		for (int s: value) {
			numlist10.add(s);
		}
		System.out.println(ListDown.go(numlist10));
		
		List<Integer> numlist11 = new ArrayList<Integer>();
 		value = new int [] {9,10,-8,10000,-5000,1000};
		for (int s: value) {
			numlist11.add(s);
		}
		System.out.println(ListDown.go(numlist11));
	}
}