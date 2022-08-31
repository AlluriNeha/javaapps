package check;

import java.util.HashMap;
import java.util.HashSet;

public class Student2 {
	public  String id;
	public String name;
	
	/*
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Object s2) {
		return this.id.equals(((Student)s2).id);
	}
	
	public Student (String id, String name) {
		this.id = id;
		this.name = name;
	}
	*/
	
	public static  void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String, String>();
		
		hs.put("1", "rahul");
		hs.put("2", "vijay");
		System.out.println(hs.size());
		hs.put("2", "neha");
		System.out.println(hs.size());
		hs.put("3", "neha");
		System.out.println(hs.size());

		
	}
	
	
}
