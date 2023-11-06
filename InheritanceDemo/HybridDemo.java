package InheritanceDemo;
class HumanBody
{
	public void displayHuman()
	{
		System.out.println("Method defined in humanBody class");
	}
}
interface Male
{
	public void display();
}
interface Female
{
	public void display();
}
public class HybridDemo extends HumanBody implements Male,Female {

	@Override
	public void display() {
		System.out.println("Implementation of display ()method defined in interface male and female");
		
	}
	public static void main(String[] args) {
		HybridDemo h=new HybridDemo();
		h.display();
		h.displayHuman();

	}

}
