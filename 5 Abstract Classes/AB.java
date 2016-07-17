interface A{
	int x = 100;
	void show(); //In interface we only can have abstract functions, so we don't need to write abstract. 
	void show2();
}

interface B{
	int y = 200;
	void show3();
}

interface AB extends A,B{
	void show11();
} 

//A interface inherits other interfaces by keyword "extends". But the class inherits interfaces by keyword "implements". 
//so there is difference of using keywords in inheritance between: class-class, class-interface, interface-interface. 


