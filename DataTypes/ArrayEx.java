package datatypes;

public class ArrayEx {

	public static void main(String[] args) {
		//literal way
int arr[]= {4,7,9,10};
//using new keyword
String a[]= {"abc","cfg"};
int arr1[]= new int [5];//declaration and instantiation
arr1[0]=34;//initialization
arr1[1]=23;
arr1[2]=45;
arr1[3]=67;

arr1[4]=56;
 System.out.println(arr.length);
 System.out.println(arr);
 
 for(int i=0;i<arr.length;i++)
 {
	System.out.println(arr[i]);
 }
	}

}
