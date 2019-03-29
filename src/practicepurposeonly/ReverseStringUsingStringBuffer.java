package practicepurposeonly;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		
		String str = "JAVA";
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	
		

	}

}
