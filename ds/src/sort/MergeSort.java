package sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 7, 1, 4,3,25,15,205,225, 4, 20, 15, 8 }; 
		  int merged[] = mergesort(arr,12);
		  printArray(merged,12);
		  
	}

	public static  void printArray (int[] arr, int length) {
		for (int i=0; i < arr.length;i++)
			System.out.print(arr[i]+",");
		System.out.println();
	}
	
	public static  void copyArray (int[] arr, int[] merged, int length, int start, int end) {
		if (end >= length) end = length-1;
		for (int i=start,j=0; i <= end;i++,j++) arr[i] = merged[j];
	}
	
	public static void merge (int []arr, int [] merged, int length, int start1, int end1, int start2, int end2) {
		int mi = 0, i = start1, j = start2;
		if (end2 >= length) 
			end2 = length-1;
		for (; i <= end1 && j <= end2; ) {
			if (arr[i] <= arr[j])   { merged[mi] = arr[i]; i++; }
			else { merged[mi] = arr[j];j++; }
			mi++;
		}
		while (i <= end1) {
			merged[mi] = arr[i];mi++;i++;
		}
		while (j <= end2) {
			merged[mi] = arr[j];mi++;j++;
		}

		
	}
	
	public static int[] mergesort (int[] arr, int length)
	{
		int merged[] = new int[length];
		int maxSize = length;
		for (int size = 1; size < maxSize; size *= 2) {
			for (int i = 0; i < length; i += 2*size) {
				merge(arr, merged,length, i,i+size-1, i+size, i+2*size-1);
				copyArray(arr,merged,length,i, i+2*size-1);
			}
			printArray(arr,length);
			
		}
		return arr;
		
		
	}
}
