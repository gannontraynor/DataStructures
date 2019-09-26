package assignment2;
import stdlib.*;
class TimeSymbolTables {
	
	public static void main(String[] args) {
		algs31.SequentialSearchST<String, Integer> SequentialST = new algs31.SequentialSearchST<String, Integer>();
		algs32.BST<String, Integer> BST = new algs32.BST<String, Integer>();
		StdIn.fromFile("data/tale.txt");
		String[] words = StdIn.readAllStrings();
		Stopwatch time1 = new Stopwatch();
		for(String word : words) {
			if(SequentialST.contains(word) == false) 
				SequentialST.put(word, 1);
			else 
				SequentialST.put(word, SequentialST.get(word) + 1);
		}
		StdOut.println("Elapsed time for SequentialST: " + time1.elapsedTime());
		Stopwatch time2 = new Stopwatch();
		for(String word2 : words) {
			if(BST.contains(word2) == false) 
				BST.put(word2, 1);
			else 
				BST.put(word2, BST.get(word2) + 1);
		}
		StdOut.println("Elapsed time for BST: " + time2.elapsedTime());
	}
}