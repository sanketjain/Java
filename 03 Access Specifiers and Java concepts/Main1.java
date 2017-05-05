class Main1{
public static void main(String[] args){

Box b1 = new Box();
Box b2 = new Box(5);
Box b3 = new Box(4,5,6);
Box b4 = new Box(b3); //b3 and b4 are different objects but have same set of values. 
//2 different people can have same name, faces, height, weight etc but still they are 2 individuals.

b1.show();
b2.show();
b3.show();
b4.show();

System.out.println(b3);

}
}