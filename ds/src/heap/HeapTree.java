package heap;

public class HeapTree {

	
	public static void createHeap(int []arr ) {
		int length = arr.length;
		for (int i = length/2-1; i >= 0; i-- ) {
			int cur = i;
			while (true) {
				int max = checkMax(arr,length,cur,2*cur+1, 2*cur+2);
				if (max == cur)
					break;
				swap (arr,max,cur);
				cur = max;
			}
		}
	}
	
	
	public static void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int checkMax(int [] arr, int length, int cur, int child1, int child2) {
		int max = cur;
		if (child1 < length && arr[child1] > arr[max])
			max = child1;
		if (child2 < length && arr[child2] > arr[max])
			max = child2;
		return max;		
	}
	
	public static void printTree (int [] arr ){
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length;i++)
			System.out.print(","+arr[i]);
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20,10,25,35, 45, 56, 78, 89, 11, 25, 35, 45, 55,15};
		printTree(arr);
		createHeap(arr);
		printTree(arr);
	}

}
