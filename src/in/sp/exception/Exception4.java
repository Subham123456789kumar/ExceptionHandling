package in.sp.exception;

public class Exception4 {

	public static void main(String[] args) {
		
		Exception4 obj=new Exception4();
		obj.display();
				
	}

	void display()
	{
		try {
			

			int a=9;
			int b=0;
			
			int c=a/b;
			
			
		} catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
			
			
		}
	}
	
	
	
}
