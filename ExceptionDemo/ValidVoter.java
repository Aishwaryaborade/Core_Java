package ExceptionDemo;

public class ValidVoter {
static void checkAge(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("oops!!Not a valid voter");	
	}
	else
	{
		System.out.println("Yes you are valid voter");
	}
}
	public static void main(String[] args) {
		checkAge(10);
	}

}
