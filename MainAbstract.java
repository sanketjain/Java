import java.util.Scanner;
class MainAbstract{

	public static void main(String a[]) {
	Base b1 = null;

	Scanner in  = new Scanner(System.in);
	int x,y;

	System.out.println("Enter the name and two values");
	String name = in.nextLine();
	x = in.nextInt();
	y = in.nextInt();

	if(x<y)
	b1 = new Derived();
	else
	b1 = new Derived2();

	b1.show();
	b1.show2();
	b1.show3();
	}
}





