package in.sp.exception;

public class Exception2 {
	public static void main(String[] args) {
		
		
		int a=67;
		int b=0;
		
		
             try {
			
			int c=a/b;
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}		
		
             
             finally {
				System.out.println("hello");
			}
             
             System.out.println("hello su ha m");
             
		
		
	}

}
