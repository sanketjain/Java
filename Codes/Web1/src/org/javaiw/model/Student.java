package org.javaiw.model;

public class Student {
	int rollno;
	String sname;
	int marks;
	public Student(){}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollno, String sname, int marks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.marks = marks;
	}
	
	@Override
	public String toString() { //toString function to display student object 
		return "<pre><b>" + rollno + "  " + sname + "   " + marks + "</b></pre><br>";
	}

}
