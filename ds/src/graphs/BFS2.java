package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS2 {
	private DiGraph g;
	private int marked[];
	
	public BFS2 (DiGraph graph) {
		g=graph;
		marked = new int[graph.V];
		
	}
	
	
	public boolean isReachable (int i,int j) {
		for (int v =0; v < g.V; v++)
			marked[v]=0;
		return isReachable2(i,j);		
	}

	/*
	0->1
	1->3
	3->4
	1->2
	2->5
	
	0->5 (True)
	2->4 (False)
	*/
	
	public boolean isReachable2 (int i, int j) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.addFirst(i);
		while (!q.isEmpty()) {									
			i = q.removeFirst();			
			ArrayList<Integer> edges = g.adj(i);
			if (edges.contains(j))
				return true;					
			if (marked[i] != 1) {
				marked[i] = 1;
				for (int edge:g.adj(i)) {
					q.addLast(edge);
				}
			}
			
		}
		return false;
	}
}
