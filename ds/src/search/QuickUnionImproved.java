package search;
public class QuickUnionImproved {
	private int[] parent;
	private int[] size;

	public QuickUnionImproved(int n) {
		parent = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			size[i]=1;
		}
	}

	public int find(int p) {
		while (p != parent[p])
			p = parent[p];
		return p;
	}


	public int rearrangeParent(int i) {
		while (i != parent[i]) {
			parent[i] = parent[parent[i]];
			i=parent[i];
		}
		return i;
	}

	
	public void union(int p, int q) {
		int rootP = find(p);
		int rootQ = find(q);
		
		if (size[rootP] <= size[rootQ]) {
//			rearrangeParent(p);
			parent[rootP] = rootQ;
			size[rootQ] += size[rootP];
		}
		else {
//			rearrangeParent(q);
			parent[rootQ] = rootP;
			size[rootP] += size[rootQ];
		}
		
	}
	
	public void print() {
		System.out.print ("Array :");

		for (int i=0; i <  parent.length;i++) {
			System.out.printf("%2d|",i);
		}
		System.out.println();
		System.out.print ("Weight:");

		for (int i=0; i  < parent.length;i++) {
			System.out.printf("%2d|",size[i]);
		}
		System.out.println();

		System.out.print ("Parent:");

		for (int i=0; i  < parent.length;i++) {
			System.out.printf("%2d|",parent[i]);
		}
		System.out.println();

		
	}
	
	public static void main (String[] args) {
		QuickUnionImproved q = new QuickUnionImproved(8);
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