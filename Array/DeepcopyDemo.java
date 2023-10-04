package arrayDemo;

public class DeepcopyDemo {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7};
		System.out.println(arr[2]);
		//Deep copy
		//Deep cloning is perform on single dimentional array it will show different memory location
		int arrclone[]=arr.clone();
		System.out.println(arr[2]);
		System.out.println(arr==arrclone);
		System.out.println(arr);
		System.out.println(arrclone);
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
			System.out.println(arrclone[i]);
			
		}
		
	}

}
