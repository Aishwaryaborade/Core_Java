package Collection;
import java.util.*;
public class ArrayDequeue {

	public static void main(String[] args) {
		Deque<String>d=new ArrayDeque<>();
		d.add("shri");
		d.add("Swami");
		d.add("Samarth");
		for(String s:d)
			System.out.println(s);
		d.offer("Hari");
		System.out.println(d);
		d.offerFirst("Dhruv");
		System.out.println(d);
		d.offerLast("Om");
		System.out.println(d);
		d.pollFirst();
		System.out.println(d);
		d.pollLast();
		System.out.println(d);
		Deque<Integer>d1=new ArrayDeque<>();
		d1.add(2);
		d1.add(4);
		d1.add(6);
		d1.add(8);
		d1.add(10);
		System.out.println(d1);
		//offer working in ArrayDeque as adding element in last &
		//in priority queue its working on sorting basis
		d1.offer(3);
		System.out.println(d1);
		d1.offerFirst(0);
		System.out.println(d1);
		d1.offerLast(14);
		System.out.println(d1);
	}

}
