package Collection;

import java.util.*;

//Vector used for multithreaded application 
//it is synchronized(only one thread execute at a time)
//it is a thread safe
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String>mammals=new Vector<>();
		//insert elements
		mammals.add("Cat");
		mammals.add("Horse");
		mammals.add("Dear");
		mammals.add("Donkey");
		mammals.add(1,"Fox");
		System.out.println("Vector elements are:"+mammals);
		Vector<String>animals=new Vector<>();
		animals.add("Lion");
		animals.add("Tiger");
		System.out.println("2nd Vector elements are:"+animals);
		//addAll method to add two vectors
		//addAll method used when generics of both vector are same
		animals.addAll(mammals);
		System.out.println("Updated Vector elements are:"+animals);
		//mammals.addAll(animals);
		//System.out.println("Updated Vector elements are:"+mammals);
	}

}
