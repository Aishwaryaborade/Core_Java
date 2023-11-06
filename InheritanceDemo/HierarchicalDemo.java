package InheritanceDemo;
//in Hierarchical there is only one parent class 
// all properties of parent class can be accessible by subclasses
//but one subclass property is not accessible by another subclass 
//here dog class property is not accessible by cow class
class PetAnimals//parent class
{
	protected String name;
	void show()

	{
		System.out.println("I am a pet animal");
	}
}
class dog extends PetAnimals//child class
{
	public void getName()
	{
		System.out.println("My name is:"+name);
	}
}
class cow extends PetAnimals//cow will aquire all the properties of PetAnimal 
{
	public void Name()//u can use any method getname or name any there is no rule
	{
		System.out.println("My name is:"+name);
	}
}
class cat extends PetAnimals
{
	public void getName()
	{
		System.out.println("My name is:"+name);
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		cat c=new cat();
		c.name="puppy";
		c.getName();
		c.show();
		cow cw=new cow();
		cw.name="Kapila";
		cw.Name();
		cw.show();
		dog d=new dog();
		d.name="monty";
		d.getName();
		d.show();

	}

}
