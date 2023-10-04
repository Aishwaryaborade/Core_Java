package accessModifierDemo;
class B
{
	public int B=90;

	public static void show()
	{
		System.out.println("A is private");
	}
	
}
public class PublicDemo {
	
	public  void main(String[] args) {
		Human obj = new Human();
		System.out.println(obj.a);// inpublic class you can access method over class ,outside class, outside package, package by sub class
		obj.test();
		
		
	}

}
