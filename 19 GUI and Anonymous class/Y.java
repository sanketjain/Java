//Important code: Anonymous class
class B{
	void show(){
		System.out.println("Hiii");
	}

	void show2(){
		System.out.println("Byee");
	}
}



class Y{
	public static void main(String a[]) {
		B b1 = new B(){  //instead of putting a semicolon we put curly brackets
			//We are creating an anonymous class here which does not have any name. 
			//This anonymous class inherits the class A
			void show2() { System.out.println("see you"); }	
			//We have show function as such but show2 is redefined	
		};
		b1.show();  //This call goes to show function of class B
		b1.show2(); //This call goes to new show2 defined in anonymous class
	}
}
	
