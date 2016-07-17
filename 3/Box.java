class Box{
int l, b, h;

Box(){ 
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
this.b=b; //Length b on left if breadth and b on right is argument int b. this.b is class member
//this is a keyword which refers to calling object. It is used in case of name conflict.
//If class member and argument have same name then we use "this"
h=c;
}

Box(Box bb){
System.out.println("Clone");
l=bb.l; //we define our length, breadth and height same as arguments length, breadth and height.
b=bb.b;
h=bb.h;
}

//4 functions with same name as class, so they are 4 constructors. 
//Every constructor has different argument. This is called constructor overloading.

public void finalize(){ System.out.println("ByeBye"); }

void show(){ System.out.println("Volume = " + l*b*h); }

@Override
public String toString(){ return "l=" + l + "\nb=" + b + "\nand \nh=" + h; }
//Override is called when we use System.out.println();
}
