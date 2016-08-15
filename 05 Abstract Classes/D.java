class D{
	public static void main(String a[]){
	
		C c1 = new C();
		c1.show();
		c1.show2();
		c1.show3();

		A a1 = c1; //Put c1 into a reference of A (a1). A child object can go into the parents reference, an interface reference. 
		a1.show();
		//a1.show3();
		a1.show2();

		B b1 = c1; //Putting the object c1 into B's reference. But interface B has only show3(), so we cannot call show() and show2().
		//b1.show();
		//b1.show2();
		b1.show3();
	}
}