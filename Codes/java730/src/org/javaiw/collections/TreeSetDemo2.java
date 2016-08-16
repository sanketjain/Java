//Supporting files are Student1.java and MyComparator.java
package org.javaiw.collections;


import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<String>setll = new TreeSet<>();
		setll.add("Hola");
		setll.add("Salute");
		setll.add("Namaste");
		setll.add("Salom");
		setll.add("nehao");
		setll.add("Bonjour");
		System.out.println(setll);
		
		
		TreeSet <Student1> set1 = new TreeSet<Student1>(new MyComparator()); //We tell TreeSet to compare according to MyComparator
		set1.add(new Student1(1, "Dinesh", "J2EE",  25624));
		set1.add(new Student1(2, "Robin",  "Cplus+", 23431));
		set1.add(new Student1(3, "Harsha", "Python", 36542));
		set1.add(new Student1(4, "Dimple", "Html5",  11343));
		set1.add(new Student1(5, "Alison", "Geology", 2456)); 
		System.out.println(set1); 
	}
}

