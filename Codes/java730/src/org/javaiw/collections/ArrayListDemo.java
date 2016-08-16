//Independent. No supporting files
package org.javaiw.collections;
//Arraylist is a type of list. ArrayList class inherits List.
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> all = new ArrayList<>(); //ArrayList object of type string
		all.add("Vicky");
		all.add("Shekhar");
		all.add(0, "Roy");
		all.add("Kanishk");
		all.add("Zhe");
		all.add("Emily");
		all.add("Rahim");		
		System.out.println(all);
	}
}
		
