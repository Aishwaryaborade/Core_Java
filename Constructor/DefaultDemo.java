package ConstructorEX;
class school
{
	String name;
	public school()//No argument constuctor
	{
		name="Edubridge";
	}
}
public class DefaultDemo {

	public static void main(String[] args) {
		school s=new school();
		System.out.println(s.name);
	}

}
