package check;

import java.util.ArrayList;

public class ALTest {
	
	public static void testStack(int i) {
		if (i%1000==0)
			System.out.println("Running stack:" + i);
		testStack(i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> s = new ArrayList<String>(3);
		for (int i = 0; i < 20; i++) {
			System.out.println("IndexKey:" + s);
			s.add(i+":");
		}
			
		
	}

}
