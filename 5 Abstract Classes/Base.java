abstract class Base{
int num1 = 100;
static int xx=1000;
void show(){
	System.out.println("num1 = " + num1);
}

abstract void show2(); //this is abstract method
abstract void show3(); //these functions only have name but they don't have any body. 
}