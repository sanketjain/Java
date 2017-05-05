class Typecasting1{
public static void main(String[] args){

int age = 12;
String s1="Sanket Jain";
long age2 = age;

//short age3 = age; this will give error because short is 2byte and age is 4 byte(int)

byte a=110, b=120, c;
// c = a+b; this one gives error. Minimum datatype required for airthmetic operations is int.
c =(byte)(a+b);
// gives output c as -26 because byte is in range (-128, 127) so it repeats after 127 from -128.


//float x =2.55; incorrect because default datatype is double which is 8 bits and float is 4 bits.
float x = 2.55f;

System.out.println(x);

}
}
