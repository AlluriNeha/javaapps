package check;
import java.util.Scanner;

public class Solution2 {

	public static void merge (int[] a, int start, int mid, int end) {
		int [] b = new int[end-start+1];
		int p1 = start;
		int p2 = mid +1;
		int p3 = 0;
		while (p1 <= mid && p2 <= end) {
			if (a[p1] < a[p2]) {
				b[p3] = a[p1];
				p1++;
			}
			else {
				b[p3] = a[p2];
				p2++;
			}
			p3++;
		}
		while (p1 <= mid) {
			b[p3++] = a[p1++];
		}
		while (p2 <= end) {
			b[p3++] = a[p2++];
		}
		for (int i = 0; i<p3;i++)
			a[start+i] = b[i];
		
	}
	
	
	
	public static void main(String[] args) {


         
    }
}