package InheritanceDemo;
// In single inheritance we can extend only one class
// In single inheritance child class copy parent class properties 
// but parent class do not copy child class property
class Vehicle
{
	int x=10;
	//method ina superclass
	public void ride()
	{
		System.out.println("Vehicle is riding!!");
	}
}
class Bike extends Vehicle
{
	 public void ride()
	{
		 super.ride();
		 System.out.println("Bike is riding!!");
	}
	 void display()
	 {
		 System.out.println("This shows Bike Class");
	 }	
}
public class SingleInh {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.ride();
		b.display();
		
	}
}
