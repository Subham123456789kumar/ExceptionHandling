package in.sp.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.text");
	}
	
	void writeFile() throws FileNotFoundException
	{
	
		String text="i am sunham kumar";
		FileOutputStream fos=new FileOutputStream("d:/xyz.text");
	}
}



public class Exception6 {
	public static void main(String[] args) {
		
		
		ReadAndWrite rw=new ReadAndWrite();
		
		try {
			
			rw.readFile();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("finally execute task");
		
		
	}

}
