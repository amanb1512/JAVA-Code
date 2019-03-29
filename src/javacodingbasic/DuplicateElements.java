package javacodingbasic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
	
		//find duplicates in the string array
		String names[] = { "java" , "c++" , "c# " , "java" , "javascript", "c++"};
		
		//since hashset does not contain duplicate values we can basially iterate thriu it and see if it gives any false values\
		
		Set<String> s = new HashSet();
		
		//trying to add values in hashset, if it returns false then its a duplicate
		for(String name : names) {
			if(s.add(name)== false) {
				System.out.println("Thhe duplicate value is -----> " + name);
			}
			
			}
		
// find duplicates using hashmap 
		
		
		
	}

}
