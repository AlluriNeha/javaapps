package check;

public class Student {
	public  String id;
	public String name;
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Student s2) {
		return this.id.equals(s2.id);
	}
	
	public Student (String id, String name) {
		this.id = id;
		this.name = name;
	}
	

	
}
