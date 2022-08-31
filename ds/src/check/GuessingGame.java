package check;

public class GuessingGame {
	
	public static int guess (int guess) {
		
	
		// TODO Auto-generated method stub
		int lo = 1;
		int hi = 100;
		int lc=0;
		while (true && lc <= 100)
		{
			int mid = (lo+hi)/2;
			if (mid == guess)
				return mid;
			if (guess > mid)
				lo=mid;
			else 
				hi=mid;
			lc++;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		for (int i=0; i <=100; i++)
			System.out.println ( i+":"+ guess(i));
	}

}

