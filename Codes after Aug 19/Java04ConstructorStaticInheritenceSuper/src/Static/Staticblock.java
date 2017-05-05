package Static;


class Student{
	int rollno;
	String sname;
	static String teachername;
	Student(){}
	
	static{
		System.out.println("Student enters");
		teachername = "Jennifer";
	}
}


public class Staticblock {
	void show()
	{
		Student.teachername = "Joselyn";
		System.out.println(Student.teachername);
	}

	static{
		System.out.println("Welcome to program");
	}

	
	public static void main(String[] args){
		Student.teachername = "Main Teacher";
		System.out.println(args[0]+ "lives in "+ args[1]);
		Student s1 = new Student();
		Student s2 = new Student();
		s1.rollno = 1; s1.sname="Tisha";
		s2.rollno = 2; s2.sname="Robin";
		System.out.println(args[2]+ "  " + Student.teachername+ "  " + s1.sname + "  " + s2.sname);
	}
	
}




