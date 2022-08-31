package graphs;

import java.util.ArrayList;

public class DFS2 {
	private DiGraph g;
	private int marked[];
	
	public DFS2 (DiGraph graph) {
		g=graph;
		marked = new int[graph.V];
		
	}
	

	
	public boolean isReachable (int i,int j) {
		for (int v =0; v < g.V; v++)
			marked[v]=0;
		return isReachable2(i,j);
		
	}

	public boolean isReachable2 (int i,int j) {
		ArrayList<Integer> edges = g.adj(i);
		if (edges.contains(j))
			return true;		
		if (marked[i] == 1)
			return false;
		for (int edge:edges)
			if (isReachable(edge,j))
				return true;
		return false;
		
	}


	
}
