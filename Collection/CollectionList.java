package Collection;

import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<>();
		name.add("Aishu");
		name.add("Priya");
		name.add("Anju");
		name.add("Kirti");
		name.add("Tanvi");
		System.out.println("Size of an array: "+name.size());
		// traversing an element from List using iterator()method
		System.out.println(name);
		Iterator<String>itr=name.iterator();
		while(itr.hasNext())//if next element is present then hasNext will print true otherwise it will print false
			//if true print then it will move in next
		{
			System.out.println(itr.next());
		}
	}

}
