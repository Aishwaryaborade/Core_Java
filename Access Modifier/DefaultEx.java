package accessModifierDemo;
class Human// class is a default class
{
	int a= 10;
	void test()//method is default
	{
		System.out.println("This is a default method");//
	}
}
public class DefaultEx {

	public static void main(String[] args) {
		Human obj = new Human();
			System.out.println(obj.a);
			obj.test();
	}

}
