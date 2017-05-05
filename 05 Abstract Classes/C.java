class C implements A, B{
//When we implement some interface, we have to give body to the abstract functions of that interface.
// If we don't do that, our class becomes an abstract class.

	public void show(){
	System.out.println("show"); //Writing x++ here will give error. We cannot modify the value of datamember from interface. It is final datamember. 
	}
	//We have written as public, because in interfaces, if we don't write anything, it is not default access but it is public access.
	//On the other hand if you remember in classes if we don't write anything, it was default access.

	public void show3(){
	System.out.println("show3");
	}

	public void show2(){
	System.out.println("show2");
	}

}