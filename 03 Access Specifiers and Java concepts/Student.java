package Water;
public class Student{

static String technology;
private int rollno;
String sname;
public int marks;
protected String emailId;

void show(String a){ }

//Overloading: More than one function in same class having same name but different type of arguments.

void show(){ System.out.println(sname); }

public String toString(){ return sname + " with id " + emailId + " has got " + marks + "marks " ; }

}


Student.technology = "java";
Student.sname = "manasa" //will give error because sname is not static.

Student s1; //s1 is a reference variable of student class so it is reference type and not value type. Int, float are value type.
s1 = new Student(); // s1 is a variable that contains reference to this object. 
s1.sname = "sanket";
s1.emailId = "sanket.jain@columbia.edu";
s1.marks = "100";
System.out.println(s1); //We are outputting the reference variable so output will be reference. 
//It will be like Student@ac234d3k i.e. classname @ hexadecimal string.

System.out.println(s1); //If function String toString was not defined then output would be as described above. Else we get
//sanket with id sanket.jain@columbia.edu has got 100 marks.

s2.sname = "manasa";











