class Student{

int rollno;
String sname;
int marks;

//We have not given any access specifier to rollno, sname, marks like private, protected, public. 
//So it is default. Default access means visible in same package.

Student(){} //in our class if we have not defined anyconstructor then java automatically adds constructor like this. 
//It is called default contructor. There are no statements, no declarations inside {} so it is called empty constructor. 
//This constructor creates object. Objects cannot be created without a constructor. 
void show(){ 
System.out.println(sname+" has got marks "); 

}
}


class Sanket{
public static void main(String a[]){

Student s1, s2; //declare 2 variables s1 and s2
s1 = new Student(); //an object Student is created and its reference goes into s1. In common terms we say s1 is object now.
s2 = new Student();

s1.rollno = 1;
s1.sname = "Jain";
s1.marks = 543;

s2.rollno = 2;
s2.sname = "Gupta";
s2.marks = 541;

s1.show();
s2.show();

}
}

