class Arraytrial2 {
public static void main(String[] args){

//declaring a new array named "a" of integer type and assigning it values:
int a[] = new int[]{345, 46, 57, 56, 35, 46, 4, 5, 57, 6, 657};


for (int i=0; i<a.length; i++){
	System.out.println(a[i]);
}

// another way of printing arrays
System.out.println("Other short and easy way to print array");
for (int x:a){
	System.out.println(x);
}

}
}