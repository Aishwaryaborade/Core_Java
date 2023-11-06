package FileDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
//serialization: converting object into stream of bytes
	public static void main(String[] args) {
	Employee e1=new Employee(101,"Aishu","Pune");
	Employee e2=new Employee(102,"Tanvi","Nashik");
	try
	{
		FileOutputStream fileout=new FileOutputStream("data.txt");
		ObjectOutputStream out=new ObjectOutputStream(fileout);//object used to store different type of data ex:int,String
		out.writeObject(e1);
		out.writeObject(e2);
		fileout.close();
		out.close();
		System.out.println("Serialized data saved in data.txt");
	}
	catch(Exception e)
	{
		e.printStackTrace();//clear
	}
	}

}
