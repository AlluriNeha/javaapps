package check;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        boolean pc = true;
        int n = A.length();
        for(int i=0;i<n/2;i++)
        {
        	if (A.charAt(i) != A.charAt(n-i-1)) {
        		pc = false;
        		break;
        	}
        }
        if(pc)
            System.out.println("Yes");
        else
            System.out.println("No");

         
    }
}