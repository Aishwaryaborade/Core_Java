package ConstructorEX;

public class Employee {
int id ;
String name;
int age;
// create parameterised constructor
Employee (int i,String n,int b)
{
	id=i;
	name=n;
	age=b;
}
//method to display value
void display()
{
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
	Employee l1=new Employee(10,"Aishwarya",21);
	Employee l2=new Employee(11,"Priyanka",20);
	Employee l3=new Employee(12,"Anjali",22);
	// call method to display value of aishwarya
	l1.display();
	l2.display();
	l3.display();
	}

}
