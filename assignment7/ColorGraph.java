//Gannon Traynor

package assignment7;

import java.util.ArrayList;
import com.sun.prism.paint.Color;

import algs13.Queue;
import algs41.Graph;

public class ColorGraph {
	private Color[] colors;
	private boolean[] visited;
	
	public ColorGraph(Graph G) {
		colors = new Color[G.V()];
		visited = new boolean[G.V()];
		bfsColor(G,0);
	}
	
	private void bfsColor(Graph G, int s) {
		Queue<Integer> q = new Queue<>();
		Color[] listOfColors = assignment7.Color.values();
		q.enqueue(s);
		while(!q.isEmpty()) {
			int v = q.dequeue();
			visited[v] = true;
			for(int c: G.adj(v)) {
				if(!visited[c]);{
					q.enqueue(c);
				}
			}
			ArrayList<Color> neighbors = new ArrayList<Color>();
			for(int c: G.adj(v)) {
				neighbors.add(colors[c]);
			}
			for(int i = 0; i < listOfColors.length; i++) {
				if(!neighbors.contains(listOfColors[i])) {
					colors[v] = listOfColors[i];
					break;
				}
			}
		}
	}
	public Color[] colors() {
		return colors;
	}
}
