class Main2Garbage{
	public static void main(String[] args){

		Box b1 = new Box();
		Box b2 = new Box(5);
		Box b3 = new Box(4,5,6);
		Box b4 = new Box(b3); 
		//b1, b2, b3, b4 contain reference to 4 different Box objects.
		int h = b1.hashCode();

		b1.show();
		b2.show();
		b3.show();
		b4.show();
		b1 = b3; //first object Box b1 = new Box(); is now useless. It is garbage. Java has mechanism called garbage collection.

		System.out.println(h);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		b2 = b4; //second object Box b2 = new Box(5); is also now garbage. Whenever garbage collector visits this program, it destroys this and the 
//object discussed above. It freeze the memory of those two. Whenever an object of your class is destroyed by garbage collection, it's finalize function is 
//called. If we want to call garbage collector from our side, we use System.gc(); This command can call garbage collector explicitly.
		System.gc();
		b1.show();
		System.out.println(b3);
	}
}











