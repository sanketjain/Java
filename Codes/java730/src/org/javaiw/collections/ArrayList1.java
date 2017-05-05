//Supporting files are Student.java. 
package org.javaiw.collections;
//Arraylist is a type of list. ArrayList class inherits List. Arraylist can have any number of elements. 
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		ArrayList<String> all = new ArrayList<>();
		all.add("Vicky");
		all.add("Shekhar");
		all.add(0, "Roy");
		all.add("Kanishk");
		all.add("Zhe");
		all.add("Emily");
		all.add("Radhe");		
		System.out.println(all);
		
		List<Student> list1 = new ArrayList<Student>(); //List is parent of ArrayList
		list1.add(new Student(1, "Divya", "java core", 344));
		list1.add(new Student(2, "Sunny", "java addv", 654));
		list1.add(new Student(3, "vishal", "SQL", 7632));
		list1.add(new Student(4, "ajay", "plsql", 356));
		list1.add(2, new Student(5, "sunil", "tally", 6323));//specfying position, so it will be added at third position
		System.out.println(list1+"\n\n\n\n");
		
		for(Student s1:list1){
			//System.out.println(s1.hashCode());
			System.out.println("Student ->"+s1+"\n"); //Call goes to toString function overridden in Student class. 
		}
		
	}
}
		
