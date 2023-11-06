package Collection;

import java.util.*;

//elements are called nodes
//3 parts1. Reference to the previous element
//2. value of the element
//3. Reference to the next element
//we can insert an elements from both as well as in the middle of the list

public class LinkedListDemo {
/* addFirst(),addLast(),removeFirst(),removeLast(),
  getFirst(),getLast
 */
	public static void main(String[] args) {
		List<String>Languages=new LinkedList<>();
		//add an elements
		Languages.add("C");
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("JavaScript");
		Languages.add(".net");
		System.out.println("LinkedList:"+Languages);
		//remove elements from list
		String str=Languages.remove(1);
		System.out.println("Removed elements in LinkedList:"+str);
		System.out.println("Updated LinkedList:"+Languages);
		Iterator<String> itr=Languages.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		}

}
