package ConstructorEX;
//constructor overloading-using same constructor in same class with different signature
public class ConstructorOverloading {
String language,b;
int n;
float c;
//constructor with no argument
ConstructorOverloading()
{
	System.out.println("this is no argument constructor");
}
ConstructorOverloading(String lang)
{
	language=lang;
	System.out.println(lang+" "+ "is programming language");
}
ConstructorOverloading(int n)
{
	this.n=n;//for calling method or var in same class
	System.out.println("This constructor is passing value "+n);
}
ConstructorOverloading(String b,float c)
{
	this.b=b;//for calling method or var in same class
	this.c=c;
	System.out.println("I am using "+b+c);
}
	public static void main(String[] args) {
		// call constructor
	ConstructorOverloading obj=new ConstructorOverloading();
	ConstructorOverloading obj1=new ConstructorOverloading("Python");
	ConstructorOverloading obj2=new ConstructorOverloading(12);
	ConstructorOverloading obj3=new ConstructorOverloading("Python",3.3f);
	}

}
