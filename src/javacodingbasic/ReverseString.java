package javacodingbasic;

public class ReverseString {

	public static void main(String[] args) {
		
		//reverse a string using for loop 
		 String s = "aman";
		 int len = s.length();
		 System.out.println("the length of the string is: " + len);
		 String rev = "";
		 
		 for(int i = len -1; i >=0; i--) {
			rev = rev + s.charAt(i);
			
		 }
		 System.out.print(rev);
		 
		
		//2. reverse a string using stringbuffer 
			
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			System.out.println("reverse using stringbuffer---> " + sb);
		 
	}
	
	
	
	
	
	

}
