package assignment8;

import algs32.BST;
import algs42.DepthFirstDirectedPaths;
import algs42.Digraph;
import algs42.DirectedCycle;
import stdlib.StdIn;
import stdlib.StdOut;

public class IndependentCourses {

	public static void main(String[] args)
	{

		//Builds Symbol table of courses
		BST<String, Integer> courseTable = new BST<String, Integer>();
		StdIn.fromFile("data\\a8courses.txt");
		String[] courseNames = StdIn.readAllStrings();
		for(int i=0; i<courseNames.length; i++) {
			courseTable.put(courseNames[i], i);
		}

		
		Digraph graph = new Digraph(courseTable.size()); 		
		StdIn.fromFile("data\\a8prereqs.txt");
		while(StdIn.hasNextLine())
		{
			graph.addEdge(courseTable.get(StdIn.readString()), courseTable.get(StdIn.readString()));
		}

		
		DirectedCycle courseCycle = new DirectedCycle(graph);		
		if(courseCycle.hasCycle()){
			StdOut.println("Graph is not a DAG. Exiting..");
		}else {
			StdOut.println("COURSES\n--------");

			for(String course : courseNames)
			{
				StdOut.println(course);
			}

			StdOut.println("\nINDEPENDENCE\n----------");
			StdIn.fromFile("data\\a8independence.txt");
			DepthFirstDirectedPaths digraphDepth;

			while(StdIn.hasNextLine())
			{
				String course1, course2;
				course1 = StdIn.readString();
				course2 = StdIn.readString();
				int s = courseTable.get(course1);
				int v = courseTable.get(course2);
				digraphDepth = new DepthFirstDirectedPaths(graph, s);
				if(digraphDepth.hasPathTo(v))
					StdOut.println(course1 + " and " + course2 + " are not independent.");
				else
					StdOut.println(course1 + " and " + course2 + " are independent.");
			}
		}


	}

}
