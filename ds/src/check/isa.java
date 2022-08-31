package check;

import java.util.Scanner;

public class isa {

    static boolean isAnagram(String a, String b) {
        String a1=""+a;
        String b1=""+b;
        a1=a1.toLowerCase();
        b1=b1.toLowerCase();

        char temp;
        char[] a2=a1.toCharArray();
        char[] b2= b1.toCharArray();
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length()-1;i++)
            {
                for(int j=i+1;j<a.length();j++)
                {
                    if(a2[i]>a2[j])
                    {
                        temp=a2[i];
                        a2[i]=a2[j];
                        a2[j]=temp;

                    }
                }
            }
            for(int i=0;i<b.length()-1;i++)
            {
                for(int j=i+1;j<b.length();j++)
                {
                    if(b2[i]>b2[j])
                    {
                        temp=b2[i];
                        b2[i]=b2[j];
                        b2[j]=temp;
                    }
                }
            }
            String k=a2.toString();
            String k1=b2.toString();
            if(k.equals(k1))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

   
    }

    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        String xyz = null;
        if (ret)
        		xyz = "Anagram";
        else
        	 xyz = "Not Anagram";
        System.out.println( xyz);
        
        //(ret) ? "Anagrams" : "Not Anagrams" );
    }
}
