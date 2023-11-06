package ExceptionDemo;
//throw used to throw error
public class ThrowDemo {
	public static void findFile()
	{
		throw new ArithmeticException ("File not found");
	}
	public static void main(String[] args) {
		try
		{
			findFile();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Reset of the code in try block");
		}
     
	}

}
