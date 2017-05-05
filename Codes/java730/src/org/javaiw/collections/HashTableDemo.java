package org.javaiw.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
//Hashtable and HashMap are same, but Hashtable is synchronized. Using hashtable will have performance penalty
//Hashtable allows to retrieve keys as a seperate collection and values as a seperate collection
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, Student1> table1 = new Hashtable<Integer, Student1>(); //key is Integer, value is object of Student class
		table1.put(1, new Student1(1, "Dinesh", "J2EE",  25624));
		table1.put(5, new Student1(5, "Robin",  "Cplus+", 23431));
		table1.put(3, new Student1(3, "Harsha", "Python", 36542));
		table1.put(4, new Student1(4, "Dimple", "Html5",  11343));
		table1.put(2, new Student1(2, "Alison", "Geology", 2456));
			
		System.out.println(table1.get(3));
			
		ArrayList<Student1> l1 = new ArrayList<>(table1.values());
		Enumeration<Integer> k1=table1.keys(); //Enumeration is a way to iterate over elements. 
		while(k1.hasMoreElements()){
			int x = k1.nextElement();
			Student1 s1 = table1.get(x);
			System.out.println(s1);
		}
	}
}
