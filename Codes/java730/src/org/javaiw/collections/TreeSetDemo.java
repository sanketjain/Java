//TreeSet example. No input or output destination required. 
package org.javaiw.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>setll = new TreeSet<>();
		setll.add("Hola");
		setll.add("Salute");
		setll.add("Namaste");
		setll.add("Salom");
		setll.add("nehao");
		setll.add("Bonjour");
		System.out.println(setll);
	}
}

//Whatever element in whatever order we add. We always get back in ascending order. This is TreeSet :)
