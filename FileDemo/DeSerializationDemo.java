package FileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//DeSerialization: stream of bytes into converting object  
public class DeSerializationDemo {

	public static void main(String[] args)throws IOException {
		Employee e=null;
		Employee d=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("data.txt");
			ObjectInputStream inp=new ObjectInputStream(fileIn);
			e=(Employee)inp.readObject();//Employee derived from employee class
			d=(Employee)inp.readObject();//reading the object
			inp.close();
			fileIn.close();
		}
		catch(Exception c)
		{
			c.printStackTrace();//to find out the error
			//return;
		}
		System.out.println("Deserialized data is:");
		System.out.println("ID:"+e.id);
		System.out.println("Name:"+e.name);
		System.out.println("Address:"+e.address);
		System.out.println("ID:"+d.id);
		System.out.println("Name:"+d.name);
		System.out.println("Address:"+d.address);
	}
}
