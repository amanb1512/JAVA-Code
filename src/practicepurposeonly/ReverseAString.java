package practicepurposeonly;

public class ReverseAString {
	
	
public static void reverseAStringTraditionally(String str) {
	     
	

	 int len = str.length();
	 
	 String rev = " ";
	 
	 for(int i = len-1 ; i >=0 ; i--)
	 {
		 rev = rev + str.charAt(i);
	
		
	 }
	 System.out.print(rev); 
	
	
}
	

	public static void main(String[] args) {
		
		reverseAStringTraditionally("java" );
		
		

	}

}
