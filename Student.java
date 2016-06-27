// package Divya;
public class Student{
	
// static String technology;
private int rollno;
String sname;
public int marks;
protected String emailId;

/*
void show(String a) {
}

*/


/*
void show() {
System.out.println(sname);	
}
*/

public String toString(){
	return sname + " with id " + emailId + " has got " + marks + " marks" ;
}


public static void main(String[] args) {

Student s1;
// Student.technology = "java";  //correct because variable named technology is static. 
//Student.sname = "shyam"; --- error because sname is not static.

s1 = new Student();
s1.sname = "Sanket";
s1.emailId = "sj2659@columbia.edu";
s1.marks = 34567;
System.out.println(s1);

}

}




