package assignment7;
import algs41.Graph;
import stdlib.In;
import stdlib.StdOut;

public class TestColorGraph {

	public static void main(String[] args) {
		String evencycle = "data/evencycle.txt";
		Graph G = new Graph(new In(evencycle));
		ColorGraph cg = new ColorGraph(G);
		com.sun.prism.paint.Color[] colors = cg.colors();
		StdOut.println("Vertex colors for " + evencycle);
		for (int v = 0; v < G.V(); v++) {
			StdOut.println(v+": "+colors[v]);
		}
		
		String oddcycle = "data/oddcycle.txt";
		Graph G2 = new Graph(new In(oddcycle));
		ColorGraph cg2 = new ColorGraph(G);
		com.sun.prism.paint.Color[] colors1 = cg2.colors();
		StdOut.println("Vertex colors for " + oddcycle);
		for (int v = 0; v < G2.V(); v++) {
			StdOut.println(v+": "+colors1[v]);
		}
		
		String k7 = "data/k7.txt";
		Graph G3 = new Graph(new In(k7));
		ColorGraph cg1 = new ColorGraph(G);
		com.sun.prism.paint.Color[] colors2 = cg1.colors();
		StdOut.println("Vertex colors for " + k7);
		for (int v = 0; v < G3.V(); v++) {
			StdOut.println(v+": "+colors2[v]);
		}
		
		String graphFilename = "data/evencycle.txt";
		Graph G4 = new Graph(new In(graphFilename));
		ColorGraph cg11 = new ColorGraph(G);
		com.sun.prism.paint.Color[] colors3 = cg11.colors();
		StdOut.println("Vertex colors for " + graphFilename);
		for (int v = 0; v < G4.V(); v++) {
			StdOut.println(v+": "+colors3[v]);
		}
	}

}
