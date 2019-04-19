package algs11;
import stdlib.*;
public class csc300hw1c {
	
	/*
	 * Gannon Trayor
	 * Enter a GPA: 4.0
Enter a GPA: 3.7
Enter a GPA: 2.9
Enter a GPA: 3.5
Enter a GPA: -1
Number of GPAs: 4
Sum of GPAs: 9.1
Average GPA: 2.275
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		double sum = 0;
		StdOut.print("Enter a GPA: ");
		double x = StdIn.readDouble();
		while(x >= 0)
		{
			StdOut.print("Enter a GPA: ");
			x = StdIn.readDouble();
			sum += x;
			count++;
		
			
		}
		StdOut.println("Number of GPAs: " + count);
		StdOut.println("Sum of GPAs: " + sum);
		StdOut.println("Average GPA: " + sum/count);

	}

}
