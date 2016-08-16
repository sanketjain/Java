//This file supports ArrayList1.java
package org.javaiw.collections;

public class Student{
	int rollno;
	String sname, course;
	int fee;
	
	Student(){}; 
	
	public Student(int rollno, String sname, String course, int fee){
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}
	
	@Override
	public String toString(){
		return rollno+"  "+sname+"  "+course+"   "+fee+"\n" ;
	}

	public void show(){
		System.out.println(sname);
	}
	
	@Override
	public int hashCode(){
		return rollno;
	}
	
	@Override
	public boolean equals(Object obj){
		Student s1, s2;
		s1=this;
		s2=(Student)obj;
		return s1.rollno==s2.rollno;
	}
	
}
