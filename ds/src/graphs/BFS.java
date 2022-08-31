package graphs;

import java.util.LinkedList;

public class BFS {
	private Graph g;
	private int marked[];
	
	public BFS (Graph graph) {
		g=graph;
		marked = new int[graph.V];
		for (int i =0; i < graph.V; i++)
			marked[i]=0;
		
	}
	
	public void bfs (int i) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.addFirst(i);
		while (!q.isEmpty()) {
			i = q.removeFirst();
			if (marked[i] != 1) {
				marked[i] = 1;
				System.out.println(i);
				for (int edge:g.adj(i)) {
					q.addLast(edge);
				}
			}
			
		}
	}
}
