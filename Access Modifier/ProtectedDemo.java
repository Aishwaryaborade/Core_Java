package accessModifierDemo;

public class ProtectedDemo {
protected String username="Aishu";
protected void display()
{
	System.out.println("This shows protected method");
}
	public static void main(String[] args) {
		ProtectedDemo obj=new ProtectedDemo();
		System.out.println(obj.username);
		obj.display();
	}

}
