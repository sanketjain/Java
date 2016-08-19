//This code creates two classes A and X.
//a1 is simply an object of class A. Nothing more. 
//On compiling using command line, I will get A.class and X.class
class A{
	void show(){
		System.out.println("Hiii");
	}

	void show2(){
		System.out.println("Byee");
	}
}



class X{
	public static void main(String a[]) {
		A a1 = new A();
		a1.show();
		a1.show2();
	}
}
	
