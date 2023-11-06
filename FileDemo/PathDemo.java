package FileDemo;
import java.io.File;
import java.io.IOException;
//absolute or canonical path will return location from root directory
//relative path will return location from current directory
public class PathDemo {

	public static void main(String[] args) {
		//initialising object and passing path as an argument
		File f =new File("data.txt");
		boolean result;
		try
		{
			result=f.createNewFile();
			if(result)//it will check file created or not
			{
				System.out.println("File created:"+f.getCanonicalPath());
				//it will return path as string
				System.out.println("File created:"+f.getAbsolutePath());
				
			}else
			{
				System.out.println("File already existed:"+f.getCanonicalPath());
				System.out.println("File created:"+f.getPath());//getting relative path
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();		
		}

	}

}
