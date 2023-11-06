package Collection;
import java.util.*;
class Student
{
	int id;
	int age;
	String name;
	public Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Dequeue {

	public static void main(String[] args) {
		//declaring Deque
		Deque<Student>inf=new ArrayDeque<>();
		Student s1=new Student(101,"Aishu",21);
		Student s2=new Student(102,"Anshu",4);
		Student s3=new Student(103,"Tanvi",25);
		Student s4=new Student(104,"Priya",30);
		Student s5=new Student(105,"Kirti",18);
		Student s6=new Student(106,"Anjali",23);
		inf.add(s1);
		inf.add(s2);
		inf.add(s3);
		inf.add(s4);
		inf.add(s5);
		inf.add(s6);
		//traverse an array using for each
		for(Student s :inf)
			System.out.println(s.id+" "+s.name+" "+s.age);
		}

}
