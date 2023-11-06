package Collection;

import java.util.*;
/* get,add,remove,removeAll
peek()-return first element , 
poll()-removing first element, 
offer()-add element on sorting basis
*/
public class LinkedList1 {

	public static void main(String[] args) {
		List<String>name=new LinkedList<>();
		name.add("Aishu");
		name.add("Priya");
		name.add("Kirti");
		name.add("Anjali");
		name.add("Tanvi");
		System.out.println("LinkedList:"+name);
		//remove elements from list
		String str=name.remove(4);
		System.out.println("Removed elements in LinkedList:"+str);
		System.out.println("Updated LinkedList:"+name);
		//adding elements in specific position
		name.add(2 ,"Pooja");
		System.out.println("Updated LinkedList:"+name);
		Iterator<String> itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//get or retrieve an elements using index number
		String str1=name.get(4);
		System.out.println("Elements at index 4:"+str);
		//change an elements at index 2
		name.set(2,"Riya");
		System.out.println("Updated LinkedList:"+name);
		//contain method used for checking if the elements contain or not
		System.out.println(name.contains("Aishu"));
		
		System.out.println(name.lastIndexOf("Riya"));
		name.clear();
		System.out.println("Updated List:"+name);
	}

}
