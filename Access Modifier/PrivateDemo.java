package accessModifierDemo;
class A
{
	private int z =23;
	private A()
	{
		
	}
	//Declaring var private
	private static void show()
	{
		System.out.println("A is private");
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		//A obj=new A();//class is private so we can not access outside the class
		//show();private method we cant access outside the class
		//System.out.println(z);

	}

}
 