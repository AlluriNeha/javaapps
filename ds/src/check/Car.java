package check;

class Auto {
	public Auto(String name) {
		System.out.println ("In Car Class:"+name);
	}
}


public class Car extends Auto {



	public Car() {
		this("BMW");
		// TODO Auto-generated constructor stub
		
	}

	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
