class LessAgeException extends Exception{
	public String toString(){ return "Your age is too less for this class"; }
}

class Student{
	String name;
	int cls;
	int age;
	
	Student(String name, int cls, int age) throws LessAgeException{
		try{
			this.name = name;
			this.age = age;
			this.cls = cls;
			if(age<11 && cls>=7)
				throw new LessAgeException();
			if(age<14 && cls>=10)
				throw new LessAgeException();
			if(age<16 && cls==12)
				throw new LessAgeException();
		} finally { System.out.println("go back"); }
	}

	public String toString() { return name + " is in class " + cls; }
}


class MainEx{
	public static void main(String a[]){
		Student s1 = null;
		try { s1 = new Student("Manan", 12, 15); } 
		catch (LessAgeException e) { System.out.println("Invalid details\n" + e); }
		finally { System.out.println("finally reached"); }
		System.out.println("Byee\n" + s1);
	}
}

