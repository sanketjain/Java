interface A{
	int x = 100;
	void show();
	void show2();
}

interface B{
	int y = 200;
	void show3();
}

interface AB extends A,B {
	void show11();
}
