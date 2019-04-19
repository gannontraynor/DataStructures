package algs11;

import csc300w18.CSC300Sorts;  // you must have the csc300.jar file installed
							  // and added to the build path.
import stdlib.StdOut;
import stdlib.StdRandom;
import stdlib.Stopwatch;

/*
 * This is the starter file for Homework 8
 * <your name goes here>
 * <Explain how you used this program to collect your data here>
 * 
 */
public class CSC300HW8 {
	
public static boolean isSorted(double[] x) {
	int n = x.length;
	for(int i = 0; i < n -1; i++)
		if(x[i] > x[i+1])return false;
	return true;
}
	//	ToDo 1
	//	write a function:  isSorted,  which will check to see if an array of doubles 
	//	passed as a parameter, is sorted.
	//  
// Use alg to sort T random arrays of length N.
public static double sortTime(int sortType, int N, int T)  {
	double time = 0.0;
	double[] a = new double[N];
	// Perform one experiment (generate and sort an array).
	for (int t = 0; t < T; t++) {
		for (int i = 0; i < N; i++)
			a[i] = StdRandom.uniform();
		time += time(sortType, a);
	}
	return time;
}

public static double time(int sortType, double[]a) {
	Stopwatch sw = new Stopwatch();
	if(sortType == 1) CSC300Sorts.Sort1(a);
	if(sortType == 2) CSC300Sorts.Sort2(a);
	if(sortType == 3) CSC300Sorts.Sort3(a);
	if(sortType == 4) CSC300Sorts.Sort4(a);
	return sw.elapsedTime();
}
	
	
	// this sample main program creates an array of size 9, passes it to Sort1
	// and prints the elapsed time.
	// you might try changing Sort2, Sort3, Sort4  just to make sure 
	// they are 'callable'
	//
	//  ToDo:  Change main, add additional methods if you want to facilitate
	//         collecting the data you need.
	//         You can automate this as much or as little as you like
	//
	//         You might want to review  XSortCompare in algs21 for some code hints
	//
	//	       Somewhere you should show how you used the   isSorted  function   
	//
	//		   You may not use any other Java classes or methods
	
	public static void main( String[] args) {
		args = new String[] { "1", "2", "3", "4", "32728", "10" };
		int alg1 = Integer.parseInt(args[0]);
		int alg2 = Integer.parseInt(args[1]);
		int alg3 = Integer.parseInt(args[2]);
		int alg4 = Integer.parseInt(args[3]);
		int N = Integer.parseInt(args[4]);
		int T = Integer.parseInt(args[5]);
		double time1 = sortTime(alg1, N, T);
		double time2 = sortTime(alg2, N, T);
		double time3 = sortTime(alg3, N, T);
		double time4 = sortTime(alg4, N, T);
		StdOut.format(" elapsed time for sort 1 %10.6f\n", time1);
		StdOut.format(" elapsed time for sort 2 %10.6f\n", time2);
		//StdOut.format(" elapsed time for sort 3 %10.6f\n", time3);
		StdOut.format(" elapsed time for sort 4 %10.6f\n", time4);
	}

}
