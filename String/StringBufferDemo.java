package concepts;

public class StringBufferDemo {

	public static void main(String[] args) {
		//Creating String using String Buffer
		StringBuffer str=new StringBuffer("elcome to ");
		//StringBuilder str=new StringBuilder(" ");
		str.append("My Home!!");
		System.out.println(str);
		//System.out.println(str.reverse());
		str.insert(0,'W');
		System.out.println(str);
		str.replace(8, 11, "for ");
		System.out.println(str);
		str.delete(11,14);
		System.out.println(str);

	}

}
