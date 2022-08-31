package check;



public class overload {
		public static long add (int a, int b) {
			System.out.println("Int Add");
			a=11;
			b=16;
			add ((long)a,(long)b);
			return a+b;
		}
		public static long add (long a, long b) {
			System.out.println("Long Add");
			a=12;
			b=17;
			return a+b;
		}
		public static void main(String[] args) {
			int a = 10;
			int b = 15;
			add(a,b);
			add ((long)a,(long)b);
			
			
			int ab[] = {1,2,3,4,5};
			int abc[] = new int[5];
			int def[] = new int[5];
			int cd[] = {1,2,3,4,5};
			
			
			
			System.out.println(ab);
			System.out.println(abc);
			System.out.println(def);
			System.out.println(cd);
			
			
		}

}
