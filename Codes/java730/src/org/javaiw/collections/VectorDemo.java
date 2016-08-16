package org.javaiw.collections;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Student1> vector1 = new Vector<Student1>();
		vector1.add(new Student1(1, "Dinesh", "J2EE",  25624));
		vector1.add(new Student1(2, "Robin",  "Cplus+", 23431));
		vector1.add(new Student1(3, "Harsha", "Python", 36542));
		vector1.add(new Student1(4, "Dimple", "Html5",  11343));
		vector1.add(new Student1(5, "Alison", "Geology", 2456)); 
		Enumeration<Student1> e = vector1.elements(); //Enumeration is a way to iterate over all elements
		while(e.hasMoreElements()){
			Student1 s1 = e.nextElement();
			System.out.println(s1.sname+" learns " + s1.fee);
		}
			
		Stack<String> stk= new Stack<>(); //Stack class is subclass of vector. 
		//Since Vector class is synchronized, so stack class is also synchronized. 
		stk.push("a");
		stk.push("b");
		stk.push("c");
		stk.push("d");
		stk.push("e");
		stk.push("f");
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
		//System.out.println(set1); 
	}
}

//Vector is useful in multithread environment

