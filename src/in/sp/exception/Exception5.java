package in.sp.exception;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}



public class Exception5 {
	
	public static void main(String[] args) {
		
		try {
			

			int  age=16;
			if (age<18) {
				
				throw new  YoungerAgeException(" you are not eligable");
				
			}
			else {
				System.out.println("you are eligable");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
