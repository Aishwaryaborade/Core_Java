package ExceptionDemo;

public class tryCatchDemo {

	public static void main(String[] args) {
		//try block
		try
		{
			int arr[]= {5,6,7,8};
			System.out.println(arr[4]);
		}
		catch(Exception e)//Handling exception
		{
			System.out.println("Something went wrong");
			System.out.println(e);
		}
	}

}
