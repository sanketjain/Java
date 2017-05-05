//Exception handling

try {
	int x, y;
	x=10;
	y=0;
	z=x/y; //Since y is assigned zero this would give error. So we use Airthmatic Exception

	Student s1 = getStudent(); //If getStudent() does not return Student object, then it will give null.
	s1.sname = "vishal";
	int a[] = new int[10]; 
	a[x] = 100; //if x = 12, we will get arrayindexoutofboundsexception

	Box b1 = new Box();

} catch (Airthmatic Exception e){
	System.out.println(e); //Prints the correct exception and entire stack of causes for this exception. Always use it. 
	z=0; //In case if y about is zero, this would automatically assign z a value of zero. 
	e.printStackTrace();
} catch (ArrayIndexOutOfBoundsException){
	System.out.println("Sorry");
} finally {
	
}