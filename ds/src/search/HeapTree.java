package search;



/*
 * heaptree: all elements in the left and right subtrees are smaller or larger than the root
 * in this example here we are finding kth smallest; so after first heapify smallest element will  come to the roor 
 */

public class HeapTree {

	
	/*
	 * heapify: start at the middle of the height of tree and move all elements so the smallest elements come to top
	 * if height of trees log(length) -> call it as "h"
	 * then we start at "h-1", check the elements at level "h" and move the smallest to "h-1"; the complexity will be approximately (n/4)*2; n/4 is approximately number of elements at level h-1
	 * then we go to "h-2" and check and move the smallest to level "h-2"  this will be approximately (n/8)*3 ..
	 * the heapify function complexity will be  o(n)
	 */
	
	public static void heapify (int[] arr, int length) {
		for (int i=length/2-1;i>=0;i--) {
			heapifySub(arr,i,length);
		}
	}
	private static void heapifySub(int[] arr, int i, int length) {
		int max = i;
		if (i*2+1 < length) {
			if (arr[i*2+1] <= arr[max]) 
				max = 2*i+1;
			if  (i*2+2 <= length && arr [i*2+2] <= arr[max]) {
				max = 2*i+2;
			}
		}
		if (max != i) {
			swap(arr,i,max);
			heapifySub (arr,max,length);
		}			
	}
	private static void swap(int[] arr, int i, int max) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[i] = arr[max];
		arr[max] = t;

	}
	
	
	public static  void printArray (int[] arr) {
		for (int i=0; i < arr.length;i++)
			System.out.print(arr[i]+",");
		System.out.println();
	}
	
	
	
	/**
	 * call heapify
	 * smallest element will move to root
	 * then take this element and move to last.
	 * then just run the function using last - 1 element, by moving last -1 element to zero and call heapify sub on (0 to length -2)
	 * in next iteration move element to last 1, replace zero with last -2, and call heapify sub on ( 0 to length -3)
	 * each heapify sub takes   o(log n)
	 * 
	 *  The total complexity will be   O (n + k * log n)

	 */
	public static int  findKthSmallest (int[] arr, int k) {
		if (k > arr.length) k = arr.length;
		int length = arr.length;
		heapify (arr,length);
		for (int i = 0; i < k; i++,length--) {
			System.out.println("Smallest("+i+") is "+arr[0]);
			swap (arr,0,length-1);
			heapifySub(arr,0,length-2);

		}
		return arr[0];
	}

	
	public static void main(String[] args ) {
		// Given array 
		int arr[] = { 7, 1, 4, 4, 20, 15, 8 }; 
		printArray(arr);	    
		System.out.println ( findKthSmallest(arr,12));
		printArray(arr);	    

	} 



}
