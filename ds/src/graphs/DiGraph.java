package graphs;

import java.util.ArrayList;

public class DiGraph {


	
	public final int V;
	public ArrayList<Integer>[] adj;
	
	
	public ArrayList<Integer> adj(int v)
	{  return adj[v];  
	}
	
	public DiGraph(int V)
	{
		this.V = V;
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		for (int v = 0; v < V; v++)
			adj[v] = new ArrayList<Integer>();
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		0->1
		1->3
		3->4
		1->2
		2->5
		
		0->5 (True)
		2->4 (False)
		*/

		
		DiGraph g = new DiGraph(6);
		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(3,4);
		g.addEdge(1,2);		
		g.addEdge(2,5);

		BFS2 d = new BFS2(g);
		System.out.println (d.isReachable(0, 5));
		System.out.println (d.isReachable(2, 4));
		
				
	//	DFS d = new DFS(g);
//		d.dfs(0);
	//	BFS b = new BFS(g);
	//	b.bfs(0);
		
	}

}
