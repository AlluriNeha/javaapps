package hash2;

import java.util.ArrayList;
import java.util.HashMap;


public class StudentHashTest {
	
	
	public static void putStudent3(Student []maps, String zip, Student value) {
		int key = zip.hashCode()%100;
		if (maps[key] == null)  {
			maps[key] = value;
			return;
		}
		for (int i=0; i <100; i++) {
			if (maps[key]==null) {
				maps[key] = value;
				return;
			}
			key++;
			if (key ==100)
				key=0;
		}
		System.out.println("Not added");
		
	}

	
	public static void putStudent2(ArrayList<Student> []maps, String zip, Student value) {
		int key = zip.hashCode()%10;
		ArrayList<Student> arrayList = (ArrayList<Student>)maps[key];
		ArrayList<Student> stList = arrayList;
		if (stList == null) {
			stList = new  ArrayList<Student> ();		
			maps[key] =stList;
			
		}
		stList.add(value);
		
	}

	
	
	
	public static void putStudent(HashMap<String,ArrayList<Student>> map, String zip, Student value) {
		ArrayList<Student> stList = map.get(zip);
		if (stList == null) {
			stList = new ArrayList<Student> ();
			map.put(zip,stList);
			
		}
		stList.add(value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"neha","rutgers");		
		Student s2 = new Student(2,"vijay","morgan");
		Student s3 = new Student(2,"maya","rutgers");
		
		Student maps[] = new Student[100];
		
		
		
		
		putStudent3(maps,  "08854",s1);
		putStudent3(maps,  "560103",s2);
		putStudent3(maps,  "08854",s3);
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Student> [] list1 = (ArrayList<hash2.Student>[]) new ArrayList<?>[100];
		putStudent2(list1,  "08854",s1);
		putStudent2(list1,  "560103",s2);
		putStudent2(list1,  "08854",s3);
		
		
	}

}
