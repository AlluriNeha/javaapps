package check;



public class GenericTest<T extends Object> {
	private  T[] arrT = null;

	@SuppressWarnings("unchecked")
	public GenericTest() {
		arrT = (T[]) new Object[10];
	}
	
	public static void main(String [] args ) {
		GenericTest<String> s = new GenericTest<String>();
		System.out.println(s);		
	}

	public T[] getArrT() {
		return arrT;
	}

	public void setArrT(T[] arrT) {
		this.arrT = arrT;
	}

}
