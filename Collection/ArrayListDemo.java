package Collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList();//we use integer as generic property
		num.add(5);
		num.add(8);
		num.add(9);
		//num.add("Cat");
		//num.add('A');
		//1st way
		System.out.println(num);
		for(int n:num)
		{
			System.out.println(n);
		}
		
		}

}
