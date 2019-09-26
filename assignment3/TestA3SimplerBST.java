package assignment3;

import stdlib.StdIn;
import stdlib.StdOut;
import java.util.Arrays;

public class TestA3SimplerBST {

	public static void main(String[] args) {
		assignment3.A3SimplerBST<String, Integer> BST1 = new assignment3.A3SimplerBST<String, Integer>();
		assignment3.A3SimplerBST<String, Integer> BST2 = new assignment3.A3SimplerBST<String, Integer>();
		StdIn.fromFile("data/tale.txt");
		String[] words = StdIn.readAllStrings();
		//Fill the first BST with unsorted words
		for(String word : words) {
			if(BST1.contains(word) == false) 
				BST1.put(word, 1);
			else 
				BST1.put(word, BST1.get(word) + 1);
		}
		int length = BST1.longestPathLength();
		StdOut.println("Longst path for an unsorted array: " + length);
		//Sort array of words
		Arrays.sort(words);
		//Fill the second BST with the sorted array
		for(String word : words) {
			if(BST2.contains(word) == false) 
				BST2.put(word, 1);
			else 
				BST2.put(word, BST2.get(word) + 1);
		}
		length = BST2.longestPathLength();
		StdOut.println("Longst path for a sorted array: " + length);
	}

}
