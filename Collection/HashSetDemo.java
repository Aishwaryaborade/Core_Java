package Collection;
import java.util.*;
//In set we can only use iterator to iterate element 
// Listiterator not working in set
public class HashSetDemo {

	public static void main(String[] args) {
		
Set <Integer>set=new HashSet<>();
set.add(10);
set.add(5);
set.add(40);
set.add(25);
set.add(50);
set.add(35);
Iterator<Integer>i=set.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}
System.out.println(set);
set.remove(10);
System.out.println(set);
set.add(12);
System.out.println(set);
Set <Integer>set1=new HashSet<>();
set1.add(2);
set1.add(4);
set1.add(6);
set1.add(8);
System.out.println(set1);
set.addAll(set1);
System.out.println(set);
set.removeAll(set1);
System.out.println(set);

class Fruits
{
	int price;
	int quantity;
	String Colour;
	String name;
	public Fruits(int price,int quantity, String name,String colour)
	{
		this.price=price;
		this.quantity=quantity;
		this.name=name;
		this.Colour=colour;
	}
}
HashSet<Fruits>inf=new HashSet<>();
Fruits f1=new Fruits(200,1,"Apple","Red");
Fruits f2=new Fruits(350,2,"Mango","Yellow");
Fruits f3=new Fruits(100,2,"Banana","Yellow");
Fruits f4=new Fruits(100,1,"Orange","Orange");
Fruits f5=new Fruits(400,2,"kiwi","Green");
inf.add(f1);
inf.add(f2);
inf.add(f3);
inf.add(f4);
inf.add(f5);
//traverse an array using for each
for(Fruits f :inf)
	System.out.println(f.price+" "+f.quantity+" "+f.name+" "+f.Colour);
}
	

	}

