//Gannon Traynor

package assignment6;

import algs32.BST;
import algs41.BreadthFirstPaths;
import algs41.Graph;
import stdlib.StdIn;
import stdlib.StdOut;

public class ShortestDistances {

	public static void main(String[] args) {
		
		BST<String, Integer> cityTree = new BST<String, Integer>();
		StdIn.fromFile("data/a6cities.txt");
		int index = 0;
		while(StdIn.hasNextLine()){
			cityTree.put(StdIn.readLine(), index);
			index++;
		}

		
		Graph graph = new Graph(cityTree.size());
		StdIn.fromFile("data/a6connections.txt");
		String[] connections = StdIn.readAllStrings();
		index = 0;
		for(int i=0; i<connections.length; i+=2)
			graph.addEdge(cityTree.get(connections[i]), cityTree.get(connections[i+1]));

		BreadthFirstPaths bfs;
		String[][] table = new String[6][];
		table[0] = new String[] {"", "Chicago", "KansasCity", "Minneapolis", "Wausau", "LaCrosse"};
		StdOut.format("%15s%15s%15s%15s%15s%15s\n", table[0]);
		for(int row = 1; row<table[0].length; row++){
			table[row] = new String[table.length];
			table[row][0] = table[0][row];
			bfs = new BreadthFirstPaths(graph,cityTree.get("Chicago")); 
			for(int col = 1; col<table[0].length; col++){
				int dist = bfs.distTo(cityTree.get(table[0][col])) + bfs.distTo(cityTree.get(table[row][0]));
				table[row][col] = Integer.toString(dist);
			}			
			StdOut.format("%15s%15s%15s%15s%15s%15s\n", table[row]);
		}

	}

}
