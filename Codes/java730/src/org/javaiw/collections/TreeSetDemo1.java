//Supporting file is Student1.java
package org.javaiw.collections;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<String>setll = new TreeSet<>();
		setll.add("Hola");
		setll.add("Salute");
		setll.add("Namaste");
		setll.add("Salom");
		setll.add("nehao");
		setll.add("Bonjour");
		System.out.println(setll);
		
		
	//When we are creating any datastructure object, any collection object. The generic datatype can be replaced by any class. 
	//It should not be integer, string or double, it can be any class.  Here we say elements are student class objects. 
		
		TreeSet <Student1> set1 = new TreeSet<Student1>();
		set1.add(new Student1(1, "Dinesh", "J2EE",  25624));
		set1.add(new Student1(2, "Robin",  "Cplus+", 23431));
		set1.add(new Student1(3, "Harsha", "Python", 36542));
		set1.add(new Student1(4, "Dimple", "Html5",  11343));
		set1.add(new Student1(5, "Alison", "Geology", 2456)); //In this tree set how will it retrieve the elements back?
		System.out.println(set1);
	}
}

