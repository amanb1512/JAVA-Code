package javacodingbasic;

public class StringManipulationConcept {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "Hey whats up buddy?? ";
		
		// 1. To check the lenght of the string
		System.out.println(str.length());
		
		// 2. to check what is the value available on 5th index
		System.out.println(str.charAt(5));
		
		// 3. To check index of specific character
		System.out.println(str.indexOf('r'));
		
		// 4. how to check second occurence of r ..uses index overloaded method
		System.out.println(str.indexOf('r', str.indexOf('r') + 1));
		
		//5. to check index of specific string 
		System.out.println(str.indexOf("have"));
		
		//6. if you search for some random string it will give you -1 eg.
		System.out.println(str.indexOf("helloo"));
		
		// 7. String comparison equalsignorecase is also there 
		System.out.println(str.equals(str1)); //false 
		
		// 8. How to get substring 
		System.out.println(str.substring(0, 9)); //The rains
		
		// 9. Trim
		String s = "  Hello World  ";
		System.out.println(s.trim()); //removes spaces from both sides 
		System.out.println(s.replace(" ", "")); //HellowWord
		
		//10. Split 
		String val = "Hi_I_Am_Perfect_In_Selenium";
		String newVal[] = val.split("_");
		for(int i = 0; i < newVal.length;i++) {
			System.out.print(newVal[i] + " "); // Hi I Am Perfect In Selenium
		}
		
		
		
		

	}
	
	
	
	

}
