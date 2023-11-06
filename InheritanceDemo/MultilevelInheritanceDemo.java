package InheritanceDemo;
class Car
{
	public Car()
	{
		System.out.println("Car class");
	}
	void Vehicle()
	{
		System.out.println("Car is a Vehicle");
	}
}
class BMW extends Car
{
	public BMW()
	{
		System.out.println("BMW class");
	}
	public void brand()
	{
		System.out.println("Car Brand is BMW");
	}
	public void speed()
	{
		System.out.println("Car speed is 100kmph");
	}
}
class Maruti extends BMW
{
	public Maruti()
	{
		System.out.println("Maruti class");
	}
	public void speed()
	{
		System.out.println("Car speed is 120kmph");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Maruti m=new Maruti();
		m.brand();
		m.speed();
		m.Vehicle();
	}
}
