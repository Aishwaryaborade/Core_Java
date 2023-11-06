package Collection;
import java.util.*;
public class TreeMapDemo {
//by default treemap will follow the ascending order
	public static void main(String[] args) {
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(106, "Aishu");
		map.put(101, "Priya");
		map.put(103, "Kirti");
		map.put(104, "Tanvi");
		map.put(105, "Anjali");
		System.out.println(map);
		//descending order
		System.out.println("Descending order of map:"+map.descendingMap());
		System.out.println("HeadMap"+map.headMap(103,true));
		System.out.println("HeadMap"+map.headMap(103,false));
		System.out.println("TailMap"+map.tailMap(103,true));
		System.out.println("TailMap"+map.tailMap(103,false));
		System.out.println("SubMap"+map.subMap(101, 105));
		System.out.println("HeadMap"+map.subMap(101,true,105,false));
		System.out.println("HeadMap"+map.subMap(101,true,105,true));
	}

}
