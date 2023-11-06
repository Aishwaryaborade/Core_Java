package concepts;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//Creating String using String Builder
	    StringBuilder str=new StringBuilder(" My Name ");
		str.append("is Aishwarya!!");
		System.out.println(str);
		//System.out.println(str.reverse());
		str.insert(0,'h');
		System.out.println(str);
		str.replace(10, 12, "for");
		System.out.println(str);
		str.delete(10,14);
		System.out.println(str);

	}

}
