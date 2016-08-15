class Value{
int value;

private Value(){} //made constructor as private. Assured that outside my class no one can create object of my class.
//Next thing is to ensure that only single object is created inside the class. For that we use static block.
// Take reference variable of my own class inside my class as static 

static Value obj;  //reference variable of my own class which is static. 

static{
	obj = new Value();
}

protected void finalize(){
	System.out.println("Destroyed");
}

public static Value getObject(){
	return obj; //returning object with help of getObject function.
}

}




class Main2{
public static void main(String[] args){
	// Value value1 = new Value(); gives error that value has private access. because constructor is private.
	Value value1 = Value.getObject();
	System.out.println(value1.hashCode());
	value1 = null;
	value1 = Value.getObject();
	System.out.println(value1.hashCode()); //we get same output because object was created only once. 

} 
}


