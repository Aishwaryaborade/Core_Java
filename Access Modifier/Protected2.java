package accessModifierDemo;

public class Protected2 {

	public static void main(String[] args) {
		
		ProtectedDemo obj=new ProtectedDemo();
		System.out.println(obj.username);
		obj.display();

	}

}
// In protected class we access within package and also access outside the package