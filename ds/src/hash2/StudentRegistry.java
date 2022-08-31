package hash2;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class StudentRegistry {
    /**
     *
     */
    private static ArrayList<Student> studentList = new ArrayList<Student>();
    private static HashMap<String,Student> studentMap = new HashMap<String,Student>();
 

    public static void initStudents() throws FileNotFoundException {
        //create scanner
        //read number of students
       Scanner s1 = new Scanner( StudentRegistry.class.getClassLoader().getResourceAsStream("data\\studentlist.txt"));
      

        int count = s1.nextInt();
        s1.nextLine();
        for (int i = 0; i < count; i++) {
            String s = s1.nextLine();
            String toks[] = s.split("[\\s,]+");
            int id = Integer.parseInt(toks[0]);
            String name = toks[1] ;
            String city = toks[2] ;    
            Student n = new Student(id,name,city)     ;     
            studentList.add(n); 
            studentMap.put(name.toUpperCase(),n);
            
        }

        
        s1.close();

        return;

    }

    public  static Student getStudent (int id) {

     

        //loop through student array list
        // return student object;
        /*
        studentList.toArray().bi
        for (Student st:studentList) {
            if (st.getId() == id) {
                return st;
            }
        }
        return null;
        */
        Student key = new Student(id,null,null);
        int i = Collections.binarySearch(studentList,key);
        if (i == -1)
            return null;
        else    
            return studentList.get(i);
   
    }

    public  static Student SearchName (String name) {

     

        /*
        for (Student st:studentList) {
        if (st.getName().compareToIgnoreCase(name) == 0 ) {
                return st;
            }
        }
        return null;
        */

        return studentMap.get(name.toUpperCase());

    }
    

    
    public static void main ( String[] args)  {
        try {
            initStudents();
        }
        catch (FileNotFoundException e ) {
            e.printStackTrace();
        }
     

        for (Student st:studentList) 
            System.out.println(st);
        studentList.sort(null);
        for (Student st:studentList) 
             System.out.println(st);


        Student s1 = getStudent (1001);
        Student s2 = getStudent (1010);
        if (s1 == null)
            System.out.println ("Can't find 1001");
        else 
            System.out.println ("Detail of student 1001: " + s1);

        if (s2 == null)
            System.out.println ("Can't find 1010");
        else 
            System.out.println ("Detail of student 1010: " + s2);

         
        Student s3 = SearchName ("raHuL");
        Student s4 = SearchName ("niTYA");
            if (s3 == null)
                System.out.println ("Can't find Rahul");
            else 
                System.out.println ("Detail of Rahul: " + s3.getId() +"," + s3.getCity());
    
            if (s4 == null)
                System.out.println ("Can't find Nitya");
            else 
                System.out.println ("Detail of student Nitya: " + s4.getId() +"," + s4.getCity());    
 
        

    }
    
    
}
