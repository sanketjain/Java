class Student{

	int rollno;
	String sname;

	static String teachername;
	Student(){}

	static {
		System.out.println("Student enters");
		teachername = "Alibaba";
	}
}


public class Main1{

	void show() { 
		Student.teachername = "ramparkash";
		System.out.println(Student.teachername);
	}

	static { System.out.println("Welcome to program"); }

	public static void main(String[] args) {
		Student.teachername = "ABCD";
		System.out.println(args[2] + Student.teachername); //args[2] mean second argument from cmd prompt. 
	}
  
}

/*
When we write javac Main1.java and then java Main1. The first output is
Welcome to program. So even before we enter main, we get this output because static block got executed.
Then inside main I call Student. So staic block inside Student gets executed which prints Student enters.
Teachername changes to Alibaba. When I get back to main, teacher name changes back to ABCD. 
But we get IndexOutofBoundsException because it is asking for command line arguments. 
When we say args[2], what do we mean ? We need to give input arguments like:
java MainTry Sarah Sanket Saheli

*/








