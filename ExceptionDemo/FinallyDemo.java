package ExceptionDemo;

public class FinallyDemo {

	public static void main(String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
			try
		{
			System.out.println(a/i);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is the finally block,this block will excute whether exception handled or not ");
		}

	}

}
