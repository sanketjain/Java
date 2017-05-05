class Value{
int value;

Value(){}

static int value2;

static{
//	value++; will give error because static function can only have static objects.
	System.out.println("Hi");
	System.out.println("Bye");
}

static void show(){
	value2 = 23432432;
	//value = 567857;
}

}

class Main{
	public static void main(String args[]){
	Value.show();
	Value.value2=1000;
	
	Value.show();
	
	Value.value1 = new Value();
	value1.value = 123;

}








