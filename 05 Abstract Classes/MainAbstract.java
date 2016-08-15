import java.util.*;
class MainAbstract{
	public static void main(String a[]){
		Base b1 = null; //Base class reference is null. It is empty reference.

		Scanner in = new Scanner(System.in); //Command to take user input.
//System.in is wrapped in Scanner class. Scanner is a wrapper class. Wrapper class is one which cannot do anything of its own.
// It can do something when another object is wrapped into that. System.in means keyboard console. 
//Wrapper class wraps some object and increases its functionality. 
		int x, y;
		System.out.println("Enter the name and two values");
		String name = in.nextLine(); //Scanner object just created has function called nextLine. It inputs string from user. 
		x=in.nextInt(); //Scanner object has function nextInt.
		y=in.nextInt();

		if(x<y)
			b1 = new Derived();//In this base class reference I have put an object of Derived class.
		else
			b1 = new Derived2();
		
		b1.show(); //show function was in the parent named Base. This call there is no show function except the one in Base.java. 
//b1.show() function call got linkedin to function definition. Whenever call is linked to function definition, it is called linking or binding.
		b1.show2(); //These calls are not linked to function definition. 
		b1.show3(); //They are linked to function definition only at runtime. 
//When function calls are linked to function definition at runtime, this is called runtime binding, late binding, dynamic binding, run-time method dispatch,
//dynamic method dispatch, runtime polymorphism. All names to same concept. A function call cannot be resolved at compile time. Because that function exists at
//more than one place, so the call is linked to function definition only at runtime, when you are sure that this call belong to this place, then only it gets linked.
	}
}
