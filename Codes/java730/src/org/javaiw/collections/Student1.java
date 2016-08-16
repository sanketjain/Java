//This file supports HashSetDemo.java, TreeSetDemo1.java, TreeSetDemo2.java

package org.javaiw.collections;

public class Student1 implements Comparable<Student1 >{ //Here I added implements comparable
	//Comparable is a generic interface. It asks inside <> what are we going to compare
	//We need to override the method of Student1 interface. hover over Student1 and click add unimplemented method.
	int rollno;
	String sname, course;
	int fee;
	
	Student1(){};
	
	public Student1(int rollno, String sname, String course, int fee){
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
	public boolean equals(Object obj){ //equals functions says two objects are same only if their rollno are same
		Student1 s1, s2;
		s1=this;
		s2=(Student1)obj;
		return s1.rollno==s2.rollno;
	}

	//Following method is added when I add unimplemented methods to Student1 class
	@Override
	public int compareTo(Student1 o) { //There is calling object "this" and argument object "o"
		return (this.fee - o.fee); //Calling object is this.fee and argument object is o.fee
	}
	
}
