class Outer{
private int outer;

Outer(int x){
outer = x;
}

class Inner{
int inner;

void show(){
	System.out.println(inner+outer);
}
}

void show(){
	Inner i1 = new Inner();
	i1.inner = 5;
//	System.out.println(inner*inner + outer*outer); //will give errors because inner is defined inside inner and not inside outer class.
	System.out.print(i1.inner*i1.inner + outer*outer);
	//in.show();

}

public static void main(String aa[]){
	Outer o1 = new Outer(12);
	o1.show();
}

//Note: We will get 2 classes. One Outer.class and other Outer$Inner.class which means Inner class is inside Outer class.


}