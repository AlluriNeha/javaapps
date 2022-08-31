package check;

import java.util.Date;
/*
 * 

public class C1 {

	public static long fibArray[] = new long[51];  
	public static long fib(int  n) {

//		if (fibArray[n] > 0)
//			return fibArray[n];
		if (n==0 || n==1)
			return 1;
		long fibN1 = fib (n-1);
		long fibN2 = fib (n-2);
		return fibN1+fibN2;
//		fibArray[n] = fibN1 + fibN2;
//		return fibArray[n];
	}
	

	public static void main(String[] args) {
		int n = 50;
		Arrays.fill(fibArray, -1);
		fibArray[0] = 1;
		fibArray[1] = 1;
		System.out.println (new Date().getTime());
		System.out.println(fib(n));
		System.out.println (new Date().getTime());

	}				
	
	public static void main(String[] args) {
		int n = 50;
		System.out.println (new Date().getTime());

		long prev1=1;
		long prev2=1;
		for (int i  = 2; i <= n; i++ ) {
			long temp=prev2;
			prev2 = prev1;
			prev1 = prev2+temp;
		}
		System.out.println(prev1);
		System.out.println (new Date().getTime());

	}	

}
*/

public class C1 {


	public static void main(String[] args) {
		String a=" ";
		String b="";
		String c="	";
		
		System.out.println("SizeA:" + a.length() + "->Char:" + a + ":End->"+(int)a.charAt(0));
		System.out.println("SizeB:" + b.length() + "=>Char:" + b + ":End");
		System.out.println("SizeC:" + c.length() + "=>Char:" + c + ":End->"+(int)c.charAt(0));
		
		
		
		
		int n = 50;
		System.out.println (new Date().getTime());

		long prev1=1;
		long prev2=1;
		for (int i  = 2; i <= n; i++ ) {
			long temp=prev2;
			prev2 = prev1;
			prev1 = prev2+temp;
		}
		System.out.println(prev1);
		System.out.println (new Date().getTime());

	}				

}
