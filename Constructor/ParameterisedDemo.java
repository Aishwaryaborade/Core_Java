package ConstructorEX;

public class ParameterisedDemo {
	String languages;//instance
	//Constructor will accept the value
	ParameterisedDemo(String lang)//lang is a local var
	{
		languages=lang;
		System.out.println(languages+" "+"is programming languages");
	}
	public static void main(String[] args) {
		//call the constructor by passing string value
		ParameterisedDemo obj = new ParameterisedDemo("Python");
		ParameterisedDemo obj1 = new ParameterisedDemo("Java");
		ParameterisedDemo obj2 = new ParameterisedDemo("C/C++");
		ParameterisedDemo obj3 = new ParameterisedDemo("Javascript");
	}

}
