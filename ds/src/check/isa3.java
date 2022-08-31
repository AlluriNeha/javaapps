package check;

import java.util.HashMap;
import java.util.Scanner;

public class isa3 {

	 static boolean isAnagram(String s1, String s2) {


		// TODO Auto-generated method stub
		 

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int chCount[] = new int[26];
		for (int i  = 0; i < s1.length(); i++) {
			int ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				chCount[ch-'a']++;
		}
		boolean ret = true;
		for (int i  = 0; i < s2.length(); i++) {
			int ch = s2.charAt(i);
			if (ch >= 'a' && ch <= 'z') 
				chCount[ch-'a']--;
			
		}
		for (int i = 0; i < 26; i++) {
			if (chCount[i] != 0) {
				ret = false;
				break;
			}
		}
		return ret;
				
	}
	
	

    public static void main(String[] args) {
   
    	
		 Double d[] =  {0.3555, 0.4555, 0.666, 3.666, 3.777};
		 for (int i = 0; i < d.length; i++)
			 	System.out.println (d[i]  + ":" + d[i].hashCode() );
		 
    	
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
