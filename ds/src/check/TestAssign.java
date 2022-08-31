package check;

public class TestAssign {

	static void foo(int[] a)
	{
		int i=0, c=0, k=1;
		int n = a.length;
		while (i < n)
		{
			a[i] = c;
			c = c + k;
			k = k + 2;
			i = i + 1;
			System.out.println("a[i],c,k,i="+a[i-1]+","+c+","+k+","+i);			
		}
	}
	
	static int f(int x, int y) {
		int r = 1;
		System.out.println("x,y,r="+x+","+y+","+r);
		while (y > 1) {
			if (y % 2 == 1) {
				r = x * r;
			}
			x = x * x;
			y = y / 2;
			System.out.println("x,y,r="+x+","+y+","+r);
		}
		return r * x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(new int[6]);
		//f(3,11);
	}

}
