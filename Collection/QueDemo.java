package Collection;
import java.util.*;
//data structure works in FIFO process =front end for deletion
//Rear end for adding object
public class QueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		//adding elements
		for(int i=0;i<5;i++)
			q.add(i*10);
		//display the content of the queue
		System.out.println("Elements are:"+q);
		//to remove the head of queue
		int a=q.remove();
		System.out.println("Removed elements are:"+a);
		//to view the head of the queue
		int head=q.peek();
		System.out.println("Head element are:"+head);
		int poll=q.poll();
		System.out.println("Removed element are:"+poll);
		//offer working in ArrayDeque as adding element in last &
		//in priority queue its working on sorting basis
		System.out.println("Adding element:"+q.offer(5));
		System.out.println("Updated elements are:"+q);
		System.out.println("Size of elements are:"+(q.size()));
		System.out.println("checking element:"+(q.contains(20)));
	}

}
