package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




public class ArrayListTest {
	public static void main(String[] args) {
		System.out.println("Testing Array List");
		testList(new ArrayList<String>());
		System.out.println("Testing Linked List");
		testList(new LinkedList<String>());
		
	}
	
	public static  void testList(List<String> al) {
		al.add("str1");
		al.add("str2");
		printList(al);
		al.add("str3");
		printList(al);
		al.add(2,"str4");
		printList(al);
		System.out.println("Element 1:"+al.remove(0));
		System.out.println("Element 1:"+al.remove(0));
		printList(al);

	}
	
	public static <E>  void printList(List<E> e) {
		Iterator<E> i = e.iterator();
		while (i.hasNext()) {
			System.out.println (i.next());
			
		}
		System.out.println("Done!");
	}
	
}
