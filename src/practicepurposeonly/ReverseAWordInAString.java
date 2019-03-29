package practicepurposeonly;

public class ReverseAWordInAString {

	public static void main(String[] args) {
		
		String str = "I am learning java";
		
		String[] s = str.split(" ");
		
		for(int i = s.length-1 ; i >=0; i--) {
			
			System.out.print(s[i]+ " ");
			
		}
		

	}

}
