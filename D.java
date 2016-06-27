 class D{
	public static void main(String a[]){
	C c1 = new C();
	c1.show();
	c1.show2();
	c1.show3();
	A a1 = c1;
	a1.show();

	a1.show2();
	B b1 = c1;


	b1.show3();
	}
}