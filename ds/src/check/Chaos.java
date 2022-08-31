package check;

import java.util.Scanner;

public class Chaos {

    // Complete the minimumBribes function below.
  
    static void swapOne (int[] q, int i) {
        int t = q[i];
        q[i] = q[i+1];
        q[i+1] = t;
    }

    static void swapTwo (int[] q, int i) {
        int t1 = q[i];
        int t2 = q[i+1];
        q[i] = q[i+2];
        q[i+1] = t1;
        q[i+2] = t2;  
    }


    static void minimumBribes1(int[] q) {
    	int ans = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
            	ans=-1;
            	break;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) ans++;
        }
        if (ans < 0)
            System.out.println ("Too chaotic");
        else
            System.out.println(ans);

    }
    
    static void minimumBribes(int[] q) {
    	int totalBribes = 0;
    	int expectedFirst = 1, expectedSecond=2,expectedThird=3;
    	for (int i = 0; i < q.length ; i++) {
		    if (q[i] == expectedFirst) {
		        expectedFirst = expectedSecond;
		        expectedSecond = expectedThird;
		        ++expectedThird;
		    } else if (q[i] == expectedSecond) {
		    	++totalBribes;
		    	expectedSecond = expectedThird;
		    	++expectedThird;
    		} else if (q[i] == expectedThird) {
    			totalBribes += 2;
    			++expectedThird;
    		} else {
                System.out.println ("Too chaotic");
                return;
    		}
    	}
        System.out.println (totalBribes);
        return;
    }


    public static void main(String[] args) {
        int q[] = {2,5,1,3,4};
        int arr[][] = new int[10][3];
        System.out.print(arr.length);
        minimumBribes(q);

    }
}