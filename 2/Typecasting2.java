class Typecasting2 {
public static void main(String[] args){

String str="255";
// int x = str; will not work because str is String Datatype. cannot put into integer type
int x = Integer.parseInt(str);

String str2 = "255k";
// int y = Integer.parseInt(str2); NumberFormatException cuz 255k cannot be converted to integer type.


System.out.println(x);

}
}