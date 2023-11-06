package Collection;

import java.util.*;

public class CollectionList2 {

	public static void main(String[] args) {
		List<String>Fruits=new Vector<>();
		Fruits.add("Mango");
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("Orange");
		Fruits.add("Pineapple");
		System.out.println(Fruits);
		for(String F:Fruits)
		{
			System.out.println(F);
		}
		Iterator<String>itr=Fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	}

	}

}
