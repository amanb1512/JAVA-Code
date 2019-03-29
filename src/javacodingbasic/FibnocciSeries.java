package javacodingbasic;

public class FibnocciSeries {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
	
		
		//System.out.print(first );
		
		for(int i = 0; i< 10; ++i) {
			
			System.out.print(first + "  ");
			
			int next = first + second;
			first = second;
			second = next;
			
		}
	
	}
}
