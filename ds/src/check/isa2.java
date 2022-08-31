package check;

import java.util.Arrays;
import java.util.Scanner;

public class isa2 {

	static void sort1 (char [] a) {
		//this sort  bring smallest element to index 0 first, then index 1 etc .. 
		// and complexity n^2
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
			}
		}
	}


	static void sort2 (char [] a) {
		//this is bubble sort. Moves largest element to last index in array

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}
		}		
	}

	static boolean isAnagram(String a, String b) {
		String a1=a.toLowerCase();
		String b1=b.toLowerCase();
		char[] a2=a1.toCharArray();
		char[] b2= b1.toCharArray();
		if(a.length()==b.length())
		{
			sort2(a2);
			sort2(b2);
		}
		return Arrays.equals(a2, b2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
