package ExceptionDemo;

public class ThrowsDemo {
	//Declared multiple exceptions using throws in method definition
public static void calculate ()throws ArithmeticException,ArrayIndexOutOfBoundsException 
{
	//int num =5/0;
	//System.out.println("num");
	int arr[]= {2,3,4};
	System.out.println(arr[5]);
	//this is block of code that may raise an exception
}
	public static void main(String[] args) {
		try
		{
			calculate();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Thrown");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException e");
			System.out.println(e.getMessage());
		}

	}

}
