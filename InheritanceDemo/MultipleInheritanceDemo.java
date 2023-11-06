/*package InheritanceDemo;
//multiple inheritance not supported in java,we can acheive multiple inheritance with the help of interface
interface Humanwalk
{
	void walk();
}
interface HumanRun
{
	void run();
}
interface A extends Humanwalk,HumanRun
{
	
}
public class MultipleInheritanceDemo implements A {

	@Override
	public void walk() {
		System.out.println("Human can walk");
		
	}

	@Override
	public void run() {
		System.out.println("Human can Run");
		
	}

	public static void main(String[] args) {
		MultipleInheritanceDemo mi=new MultipleInheritanceDemo();
		mi.walk();
		mi.run();

	}

}
//class ----extend ---class
//interface---extends---interface
//interface---implements---class
*/