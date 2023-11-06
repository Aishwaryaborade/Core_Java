package Collection;
import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		//create SortedSet using TreeSet
		SortedSet<Integer>num=new TreeSet<>();
		//inserting elements
		num.add(56);
		num.add(45);
		num.add(6);
		num.add(5);
		System.out.println(num);
		//access the element
		int firstnumb=num.first();
		System.out.println(firstnumb);
		int lastnumb=num.last();
		System.out.println(lastnumb);
		boolean a=num.remove(2);//boolean for checking no.is present or not
		System.out.println(a);
		System.out.println(num.subSet(6,56));
		System.out.println(num.tailSet(45));
		System.out.println(num.headSet(45));

	}

}
