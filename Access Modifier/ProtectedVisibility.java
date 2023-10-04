package accessModifier2;
import accessModifierDemo.*;
public class ProtectedVisibility extends ProtectedDemo{

	public static void main(String[] args) {
		ProtectedVisibility p= new ProtectedVisibility();
		System.out.println(p.username);
		p.display();
	}

}
//In protected class we access within package and also access outside the package