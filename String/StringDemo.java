package concepts;
//String is immutable
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String a= "java";
		String b="   java";
		String c = new String ("java");
		String x= "Java is a programming language";
		
		//equals -> checks values only
		//== -> checks the memory location address
		System.out.println(a.equals(c));
		System.out.println(a==b);
		System.out.println(a==c);// bcoz String a is literal method and string c uses new keyword 
		String []result= x.split(" ");
		System.out.println("result=");
		for (String str:result)
		{
			System.out.println(str+"$");
		}
		System.out.println(b.trim());// remove unwanted space
		String text =new String ("Hiii my name is Aishwarya");
		String []sentence=text.split("\\.");
		System.out.println(sentence);
		System.out.println(Arrays.toString(sentence));// tostring print value in string format
		System.out.println(a.valueOf(b));// print the value of b
	}

}
