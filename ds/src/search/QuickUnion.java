package search;
public class QuickUnion {
	private int[] parent;

	public QuickUnion(int n) {
		parent = new int[n];
		for (int i = 0; i < n; i++)
			parent[i] = i;
	}

	public int find(int p) {
		while (p != parent[p])
			p = parent[p];
		return p;
	}

	public void union(int p, int q) {
		int rootP = find(p);
		int rootQ = find(q);
		parent[rootP] = rootQ;
	}
	
	public void print() {
		System.out.print ("Array :");
		for (int i=0; i <  parent.length;i++) {
			System.out.printf("%2d|",i);
		}
		System.out.println();
		System.out.print ("Parent:");

		for (int i=0; i  < parent.length;i++) {
			System.out.printf("%2d|",parent[i]);
		}
		System.out.println();

		
	}
	
	public static void main(String[] args) {
		QuickUnion q = new QuickUnion(8);
		q.print();
		q.union(1, 2);
		q.print();
		q.union(3, 5);
		q.print();
		q.union(2, 7);
		q.print();
		q.union(2, 6);
		q.print();
		q.union(7, 6);
		q.print();

	}
}