package Collection;
import java.util.*;
public class PriorityQue {

	public static void main(String[] args) {
		//Declare PriorityQueue
		//offer working in ArrayDeque as adding element in last &
		//in priority queue its working on sorting basis
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Orange");
		pq.add("Banana");
		pq.add("pear");
		System.out.println("Elements in Priority queue :"+pq);
		pq.remove();
		System.out.println("Elements in Priority queue :"+pq);
		//every elements in priority queue have a comparable,it will delete higher priority elements
		pq.remove();
		System.out.println("Elements in Priority queue :"+pq);    



	}

}
