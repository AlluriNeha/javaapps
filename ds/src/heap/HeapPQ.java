package heap;

public class HeapPQ {

	private int SIZE=20;
	private int[] vals;
	private int currentSize = 0;

	private boolean less(int i, int j)
	{
		return vals[i] < vals[j];		 
	}
	private void swap(int i, int j)
	{ 
		int  t = vals[i];
		vals[i] = vals[j]; 
		vals[j] = t; 
	}

	private void swim(int k)
	{
		while (k > 1 && less(k/2, k))
		{
			swap(k/2, k);
			k = k/2;
		}
	}

	private void sink(int k)
	{
		while (2*k <= currentSize)
		{
			int j = 2*k;
			if (j < currentSize && less(j, j+1)) j++;
			if (!less(k, j)) break;
			swap(k, j);
			k = j;
		}
	}


	public void insert(int v)
	{
		vals[++currentSize] = v;
		swim(currentSize);
	}
	
	public int deleteMax()
	{
		int max=vals[1];		
		swap(1, currentSize); // Exchange with last item.
		vals[currentSize]=0;
		currentSize--;
		
		sink(1); // Restore heap property.
		return max;
	}
	
	
	public int deleteElement(int id)
	{
		int ele=vals[id];
		vals[id]=vals[currentSize];
		vals[currentSize]=0;
		currentSize--;
		sink(id); // Restore heap property.
		return ele;
	}
	
	
	public void print() {
		for (int i=1; i <= currentSize;i++) {
			System.out.print(vals[i]);
			if (i!=currentSize)
				System.out.print(",");
			else				
				System.out.println();				
		}
	}
	
	public HeapPQ() {
		vals = new int[SIZE];

	}
	public  HeapPQ (int [] arr) {
		vals = new int[arr.length+1];
		for (int i=0; i<arr.length;i++)
			vals[i+1]=arr[i];
		currentSize=arr.length;
		for (int i=currentSize/2;i>=1;i--) {
			sink(i);
		}
	}

	

 


	public static void main(String[] args) {
		HeapPQ pq = new HeapPQ();
		pq.insert (10);
		pq.insert (5);
		pq.insert(20);
		pq.insert(18);
		pq.insert(25);
		pq.insert (30);		
		pq.insert (60);
		pq.insert (55);
		pq.insert (28);
		
		
		// TODO Auto-generated method stub
		pq.print();
		
		/*
		System.out.println(pq.deleteMax());
		pq.print();
		*/
		
		System.out.println(pq.deleteElement(3));
		pq.print();

		/*
		int arr[] = {10,5,20,18,25,30,60,55,28};
		HeapPQ pq2 = new HeapPQ (arr);
		pq2.print();
		*/
		
	}

}
