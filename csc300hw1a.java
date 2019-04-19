package algs11;
import stdlib.*;
import java.lang.Math;
public class csc300hw1a {
	
	/*
	 *Gannon Traynor
	 * First Number: 3.5
	Second Number4.2
	7.7
	-0.7000000000000002
	0.8333333333333333
	192.79056951583615
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print("First Number: ");
		double a = StdIn.readDouble();
		StdOut.print("Second Number");
		double b = StdIn.readDouble();
		StdOut.println(a + b);
		StdOut.println(a - b);
		StdOut.println(a/b);
		StdOut.println(Math.pow(a,b));
		
	}

}
