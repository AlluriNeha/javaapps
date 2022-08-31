package graphs;

import java.util.ArrayList;

public class Graph {

	
	public final int V;
	public ArrayList<Integer>[] adj;
	
	
	public Iterable<Integer> adj(int v)
	{  return adj[v];  
	}
	
	public Graph(int V)
	{
		this.V = V;
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		for (int v = 0; v < V; v++)
			adj[v] = new ArrayList<Integer>();
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
		adj[w].add(v);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(2, 3);
		g.addEdge(0,4);
		g.addEdge(4,5);		
		g.addEdge(0,2);
		g.addEdge(2,5);
		
		
				
		DFS d = new DFS(g);
		d.dfs(0);
		BFS b = new BFS(g);
		b.bfs(0);
		
	}

}
