package ExceptionDemo;
/*
 * if the class is final we can't able to inherit the final class
 * if method is final we can't override the method
 * 
 */
final class TestFinal
{
	public final void show()
	{
		System.out.println("This is final method");
	}
}
/*class A extends TestFinal
 {
 	public final void show()   
 	{
 		
 	}
 } *///we cant inherit final class as well as we can't override final final method too
public class FinalDemo {

	public static void main(String[] args) {
		TestFinal t=new TestFinal();
		t.show();
	}

}
