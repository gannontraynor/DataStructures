package assignment2;
import stdlib.*;
public class FileMaxMin {

	public static void main(String[] args) {
		StdIn.fromFile("data/100ints.txt");
		String[] intsAsStrings = StdIn.readAllStrings();
		//Convert the string types to integers in order to perform math on the value
		int[] ints = new int[intsAsStrings.length];
		for(int i = 0; i < ints.length; i++) {
			ints[i] = Integer.parseInt(intsAsStrings[i]);
		}
		int min = ints[1];
		int max = ints[1];
		for(int i = 0; i < ints.length; i++) {
			if(ints[i] > max) max = ints[i];
			if(ints[i] < min) min = ints[i];
		}
		StdOut.println("The min value in the text is: " + min);
		StdOut.println("The max value in the text is: " + max);

	}

}
