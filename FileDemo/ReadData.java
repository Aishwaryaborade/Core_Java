package FileDemo;

import java.io.FileInputStream;

public class ReadData {

	public static void main(String[] args) {
		//file input stream-read data
		try
		{
		FileInputStream input=new FileInputStream("data.txt");
		//read first byte
		int i=input.read();
		while(i!=-1)
		{
			System.out.println((char )i);
			//read next byte from the file
			i=input.read();//read data using read method
		}
		input.close();//closing
		}
		catch(Exception e)
		{
			//e.getStackTrace();
			System.out.println("Exception occured");
		}

	}

}
