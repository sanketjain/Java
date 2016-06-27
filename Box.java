class Box{
int l, b, h;	

Box() {
	System.out.println("Empty");
	l=b=h=0;
}

Box(int a){
	System.out.println("Cube");
	l=b=h=a;
}

Box(int a, int b, int c){
	System.out.println("Cuboid");
	l=a;
	this.b = b;
	h = c;
}

Box (Box bb) {
	System.out.println("Clone");
	l = bb.l;
	b = bb.b;
	h = bb.h;
}

public void finalize() {
	System.out.println("ByeBye");
}

void show(){
	System.out.println("Volume = " + l*b*h);
}

@Override
public String toString(){
	return "l = " + l + "\nb = " + b + "\n and \nh = " + h ;
}




}

