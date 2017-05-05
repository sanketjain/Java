//Supporting file is Student1.java
package org.javaiw.collections;
// Hashset stores elements according to hashtable. 
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String>setll = new HashSet<>();
		setll.add("Hola");
		setll.add("Salute");
		setll.add("Namaste");
		setll.add("Salom");
		setll.add("nehao");
		setll.add("Bonjour");
		System.out.println(setll);
		
		HashSet <Student1> set1 = new HashSet<Student1>(); 
		set1.add(new Student1(1, "Dinesh", "J2EE",  25624));
		set1.add(new Student1(2, "Robin",  "Cplus+", 23431));
		set1.add(new Student1(1, "Harsha", "Python", 36542)); //putting two objects at same place will not give this as output
		set1.add(new Student1(4, "Dimple", "Html5",  11343));
		set1.add(new Student1(5, "Alison", "Geology", 2456)); 
		System.out.println(set1); 
	}
}

