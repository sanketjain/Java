//Supporting files are Student.java. 
package org.javaiw.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> all = new LinkedList<>();//LinkedList is preferred over Arraylist when 
		//All elements in Arraylist are kept together in contiguous location. Retrieval is fast. Good performance in fewer number of elements
		//In LinkedList elements could be at any scattered location. But every element has address of its next element. Use when number of elements is too high
		all.add("Vicky");
		all.add("Shekhar");
		all.add(0, "Roy");
		all.add("Kanishk");
		all.add("Zhe");
		all.add("Emily");
		all.add("Radhe");		
		System.out.println(all);
		
		List<Student> list1 = new LinkedList<Student>();
		list1.add(new Student(1, "Divya", "java core", 344));
		list1.add(new Student(2, "Sunny", "java addv", 654));
		list1.add(new Student(3, "vishal", "SQL", 7632));
		list1.add(new Student(4, "ajay", "plsql", 356));
		list1.add(2, new Student(5, "sunil", "tally", 6323));//specfying position, so it will be added at third position
		System.out.println(list1+"\n\n\n\n");
		for(Student s1:list1){
			//System.out.println(s1.hashCode());
			System.out.println("Student ->"+s1+"\n"); //Call goes to toString function overriden in Student class. 
		}
	}
}
		
