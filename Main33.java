class Main33{
	
	public static void main(String a[]){

	Box b1 = new Box();
	Box b2 = new Box(5);
	Box b3 = new Box(4,5,6);
	Box b4 = new Box(b3);
	b1.show();
	b2.show();
	b3.show();
	b4.show();
	System.out.println(b3);
	}
}