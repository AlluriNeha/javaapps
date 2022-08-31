package graphs;

public class DFS {
	private Graph g;
	private int marked[];
	
	public DFS (Graph graph) {
		g=graph;
		marked = new int[graph.V];
		for (int i =0; i < graph.V; i++)
			marked[i]=0;		
	}
	
	public void dfs (int i) {
		if (marked[i] == 1)
			return;
		System.out.println(i);
		marked[i]=1;
		for (int edge:g.adj(i)) {
			if (marked[edge]==0)
				dfs(edge);
		}
		
	}

	
	
	
}
