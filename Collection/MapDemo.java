package Collection;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		//map implementation using HashMap
		//Map<key,value>(here value and key must be integer and string)
		//key must be unique value can be duplicate
		Map<String,Integer> even=new HashMap<>();
		//insert the value to the map
		even.put("First",10);
		even.put("Second",20);
		even.put("Third",8);
		even.put("Fourth",15);
		even.put("Fifth",30);
		System.out.println("Map elements are:"+even);
		//access key from the map
		System.out.println("Map keys are:"+even.keySet());
		//access value from the map
		System.out.println("Map values are:"+even.values());
		//access entries on the map
		System.out.println("Map entries are:"+even.entrySet());
		//removing elements from map using key 
		int value=even.remove("Third");
		System.out.println("Deleted element is:"+value);
		System.out.println("Map elements are:"+even);
		
		Map<Integer,String> even1=new HashMap<>();
		//insert the value to the map
		even1.put(1,"One");
		even1.put(2,"Two");
		even1.put(3,"Three");
		even1.put(4,"Four");
		even1.put(5,"Five");
		System.out.println("Map elements are:"+even1);
		System.out.println("Map elements are:"+even1);
		//access key from the map
		System.out.println("Map keys are:"+even1.keySet());
		//access value from the map
		System.out.println("Map values are:"+even1.values());
		//access entries on the map
		System.out.println("Map entries are:"+even1.entrySet());
		//removing elements from map using key 
		String value1=even1.remove(1);
		System.out.println("Deleted element is:"+value1);
		System.out.println("Map elements are:"+even1);
		
	}

}
