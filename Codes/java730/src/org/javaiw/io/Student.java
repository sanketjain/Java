//This class is called by other classes. This one does nothing by itself without being called. 

package org.javaiw.io;

import java.io.Serializable; 

public class Student implements Serializable { //gives nothing. Why do we inherit it ? This function is only symbolic that yes objects of this class can be serialized.
	
	int rollno;
	String sname;
	int marks; //right click. choose Source > Generate constructor using Field. Click OK.
	
	public Student(int rollno, String sname, int marks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.marks = marks;
	}
	
	@Override   //We override toSting function
	public String toString() {
		// TODO Auto-generated method stub
		return rollno+"    "+sname+"    "+marks;
	}	
}
