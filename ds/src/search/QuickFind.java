package search;
public class QuickFind {
	private int[] id;

	public QuickFind(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++)
			id[i] = i;
	}

	public int find(int p) {
		return id[p];
	}

	public void union(int p, int q) {
		int pid  = id[p];
		int qid  = id[q];
		for (int i=0; i < id.length; i++)
			if (id[i]==pid) id[i]=qid;
	}
	
	public void print() {
		System.out.print ("Array :");

		for (int i=0; i <  id.length;i++) {
			System.out.printf("%2d|",i);
		}
		System.out.println();
		System.out.print ("Parent:");

		for (int i=0; i  < id.length;i++) {
			System.out.printf("%2d|",id[i]);
		}
		System.out.println();

		
	}
	
	public static void main(String[] args) {
		QuickFind q = new QuickFind(8);
		q.print();
		q.union(1, 2);
		q.print();
		q.union(3, 5);
		q.print();
		q.union(2, 7);
		q.print();
		q.union(2, 6);
		q.print();
		q.union(4, 7);
		q.print();

	}
}