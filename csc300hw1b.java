package algs11;
import stdlib.*;
public class csc300hw1b {	
	/*
	 *Gannon Traynor
Input a positive integer: 8
8
4
2
1
3 Iterations
3.0

Input a positive integer: 19
19
9
4
2
1
4 Iterations
4.247927513443585



	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		StdOut.print("Input a positive integer: ");
		int x = StdIn.readInt();
		double log =  Math.log(x)/Math.log(2);
		StdOut.println(x);
		while(x > 1) {
			x /= 2;
			StdOut.println(x);
			count++;
			}
		StdOut.println(count + " Iterations" );
		StdOut.println(log);
		}
	
	}


