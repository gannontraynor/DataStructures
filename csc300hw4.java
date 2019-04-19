package algs11;
import stdlib.*;
public class csc300hw4 {
	
	/*
	 * Gannon Traynor
Enter an integer:  9
9
45
45

	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print("Enter an integer:  ");
		int m  = StdIn.readInt();
		StdOut.println(m);
		int totalSum = 0;
		for(int i = 0; i <= m; i++) {
			totalSum += sumInts(i);
		}
		StdOut.println(totalSum);
		StdOut.println((m+1)*m/2);
	}
	
	public static int sumInts(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum++;
		}
		return sum;
	}

}
