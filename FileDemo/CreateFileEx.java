package FileDemo;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
//write data using file output stream
//read data using file input stream
public class CreateFileEx {
//for creating file always write exception bcoz sometimes there is file alrady exits or other errors
	public static void main(String[] args) throws IOException{
		File file =new File("data.txt");//Representing file
		if(file.exists());
		{
			file.createNewFile();//file will create
		}
		//writing data inside a file
		FileOutputStream fos=new FileOutputStream(file);
		String data="I am Aishwarya Borade";
		//for sserialization we used getbytes
		//we write english data but it store in bytes form so use getbytes
		String data1="\nEdubridge";
		String data3="\n21/8/2023";
		fos.write(data.getBytes());
		fos.write(data1.getBytes());
		fos.write(data3.getBytes());
		fos.flush();
		//flush method will remove all data present inside the write
		
	}

}
