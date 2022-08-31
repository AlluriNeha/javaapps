package search;

public class BinarySearch {

	
	public static int indexOf (int key, int[] a) {
		int lo = 0;
		int hi = a.length-1;
		while (lo <= hi) {
			int mid = lo + (hi-lo)/2;
			if (key==a[mid]) {
				return mid;
			}
			else if (key < a[mid]) {
				hi = mid-1;
			}
			else {
				lo=mid+1;
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 2, 3, 4, 4, 4, 7,7,7,7,7};
		System.out.println("Index of 4=" + indexOf(4,a));
		System.out.println("Index of 7=" + indexOf(7,a));
		

	}

}
