/* class Student contains rollno, sname, course, marks

function getdata() which inputs all the values from user
function show() displays all details of student on screen

class Main
main function

create an array of 5 student objects
input all the details of 5 students by calling getdata() function for each

display details of 5 students on screen by calling display function.

finally get average marks for all the 5 students.
*/

import java.util.*;

class Student{
	int rollno;
	String sname;
	String course;
	int marks;

	void getdata() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the rollno, name, course and marks");
		rollno = in.nextInt();
		sname = in.next();
		course = in.next();
		marks = in.nextInt();
	}
	
	void show() {
		System.out.println("Roll number " + rollno + "'s name is " + sname + " got " + marks + " in " + course );
	}

}


class Main{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		s1.getdata();
		s2.getdata();
		s3.getdata();
		s4.getdata();
		s5.getdata();
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		s5.show();
		double average = ( s1.marks + s2.marks + s3.marks + s4.marks + s5.marks ) / 5.0 ;
		System.out.println(average);
	}
}