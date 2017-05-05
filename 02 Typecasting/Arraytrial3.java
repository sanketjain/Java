class Arraytrial3{
public static void main(String[] args){

int arr[][];
arr = new int[4][5];
arr[0][1] = 123;

arr = new int[4][];
arr[0] = new int[5];
arr[1] = new int[10];
arr[2] = new int[3];
arr[3] = null;

System.out.println(arr[0][1]);


}
}