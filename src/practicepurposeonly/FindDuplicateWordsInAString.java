package practicepurposeonly;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateWordsInAString {

	public static void findDuplicateWords (String str)
	{
	 String[] s = str.split(" ");
	 
	 Map<String, Integer> hm = new HashMap<>();
	 
	for(String tempString : s) {
		
		if(hm.get(tempString) != null) {
			hm.put(tempString, hm.get(tempString) +1);
		}
		else
		hm.put(tempString, 1);
		
	}
	
	 Iterator<String> tempString =   hm.keySet().iterator();
	  while(tempString.hasNext())
	  {
		 String temp = tempString.next();
	  }
	}
	
	
	public static void main(String[] args) {
		
		
		findDuplicateWords("I am am learning java java java ");

		

	}
	
	
}
