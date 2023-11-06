package FileDemo;

import java.io.Serializable;
//Serializable is an interface or marker interface provide message to the JRE 
//implementing class itself to be serialized 
public class Employee implements Serializable 
{
String name,address;
int id;
public Employee(int id,String name,String address)
{
	this.id=id;
	this.address=address;
	this.name=name;
}
}
