package check;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerTest implements Serializable{
	public  String id;
	public String name;
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Object s2) {
		return this.id.equals(((Student)s2).id);
	}
	
	public SerTest (String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static  void main(String[] args) throws IOException, ClassNotFoundException {
		SerTest s1 = new  SerTest("1", "rahul");
		FileOutputStream fs = new FileOutputStream("c:\\users\\vijay\\temp\\r1.txt");

		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(s1);
		
		FileInputStream fs1 = new FileInputStream("c:\\users\\vijay\\temp\\r1.txt");

		ObjectInputStream os1 = new ObjectInputStream(fs1);
		SerTest s2 = (SerTest)os1.readObject();
		System.out.println(s2);
		

		
	}
	
	
}
