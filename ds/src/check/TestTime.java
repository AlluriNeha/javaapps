package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TestTime {
	static String days[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

	public static int getDay (String s1) {
		for (int i=0; i <= 6; i++) {
			if (days[i].equalsIgnoreCase(s1)) return i;
		}
		return 0;
	}

	public static int getDayDiff (String s1, String s2) {
		int index1 = getDay(s1);
		int index2 = getDay(s2);
		if (index2 >= index1) return index2 - index1;
		else
			return index1 - index2 + 7;
	}
	public static int getHrs (String s1, String s2, int hr1, int hr2) {
		int dayDiff = getDayDiff (s1,s2);
		if (dayDiff == 0 && hr2 >= hr1) {
			return hr2-hr1;
		}
		else
		if (dayDiff == 0 ) {
			return 168+hr2-hr1;
		}
		else {
			return 24-hr1+(dayDiff-2)*24+hr2;
		}
			
	}
	
	public static String schedule(List<String> windows) {
		int sched[]=new int[168];
		Arrays.fill(sched, 0);
		for(String window:windows) {
			String ele[] = window.split(" ");
            String day1 = ele[0];
            int hr1 = Integer.parseInt(ele[1]);
            String day2 = ele[3];
            int hr2 = Integer.parseInt(ele[4]);
            int startind=getDay(day1)*24+hr1;
            int endind=getDay(day2)*24+hr2;
            if (startind <= endind)
            	Arrays.fill(sched, startind, endind, 1);
            else {
            	Arrays.fill(sched, 0, endind, 1);
            	Arrays.fill(sched,startind,167,1);
            }
		}
		int fz = -1;
        for (int i = 0; i < 168; i++) {
        	if (fz == -1) {
        		if(sched[i]==1) {
        			fz=i;
        			
        		}
        		else{
        			continue;
        		}
        		
        		
        	}
        }
        return "A";
     }

	
	

    public static void main(String[] args) {
		
		
    	/*
    	String a = "Mon 5 - Tue 11";
        String ele[] = a.split(" ");
        System.out.println(ele);
        */
    	
    	
        List<String> a = new ArrayList<String> ();
        a.add("Mon 1 - Tue 3");
        a.add("Mon 12 - Mon 1");
        a.add("Mon 5 - Sun 7");
        
        
        
        for ( String a1:a ) {
        	System.out.println(a1);
            String ele[] = a1.split(" ");
            String day1 = ele[0];
            int hr1 = Integer.parseInt(ele[1]);
            String day2 = ele[3];
            int hr2 = Integer.parseInt(ele[4]);
            
            System.out.println(a1+":"+ getHrs(day1, day2, hr1, hr2));
            

        	
        }
        
        
    }
}
