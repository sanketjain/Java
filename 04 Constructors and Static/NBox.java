class Box{
	int l, b, h;
	Box(){ 
		System.out.println("Empty");
		l=b=h=0; 
	}
	Box(int x){
		System.out.println("Cube");
		l=b=h=x;
	}
	Box(int a, int b, int c){
		System.out.println("Cuboid");
		l=a; this.b=b; h=c;
	}
	Box(Box b0){
		l=b0.l; b=b0.b; h=b0.h;
	}
	void show(){
		int vol;
		vol = l*b*h;
		System.out.println("Volume = " + vol); 
	}

}

class NewBox extends Box{
	int w;
	NewBox(){
		w=0; //when we call constructor of child, it will send call to constructor of parent. 
	}
	NewBox(int a){
		super(a); //super calls constructor of parent class. Super must be first statement in my constructor. 
		w=a;
	}
	NewBox(int a, int b, int c, int d){
		super(a, b, c); //If super is not written then call will always go to default constructor of parent. 
		w=d;
	}

	public void show(){
		super.show();
		System.out.println("Weight = " + w);
	}
}


class Main {
	public static void main(String a[]){
		NewBox b1, b2, b3;
		b1 = new NewBox();
		b2 = new NewBox(5);
		b3 = new NewBox(4,5,6,100);
		b1.show();
		b2.show();
		b3.show();
	}
}
