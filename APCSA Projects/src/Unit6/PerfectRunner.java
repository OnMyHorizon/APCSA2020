package Unit6;


import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect perf = new Perfect();
		perf.setNumber(496);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(45);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(6);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(14);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(8128);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(1245);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(33);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(28);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(27);
		perf.isPerfect();
		System.out.println(perf +"\n");
		
		perf.setNumber(33550336);
		perf.isPerfect();
		System.out.println(perf +"\n");
	}
}