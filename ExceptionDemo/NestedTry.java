package ExceptionDemo;

public class NestedTry {

	public static void main(String[] args) {
		try//outer try
		{
			//inner block 1
			try
			{
				System.out.println("Going to divide by 0");
				int b=45/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				System.out.println("oops!! we cant diviide number with 0");
			}
			//inner block 2
			try
			{
				int a[]=new int[4];
				//assigning the value of array bounds
				a[0]=3;
				a[1]=2;
				a[2]=6;
				a[3]=8;	
				System.out.println(a[30]);
			}
			   catch(ArrayIndexOutOfBoundsException e)
				{
				   System.out.println(e);
				}
			
			}
		catch(Exception e)//catch block of outer try block,
		//if inner catch is not handled exception the outer catch will handle exception
			{
				System.out.println("Handled the exception outer catch");
			}
		 		System.out.println("Normal flow...");//any statement out of each
	}

}
