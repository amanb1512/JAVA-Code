package javacodingbasic;

class Test5 { 
public
    static void main(String[] args) 
    { 
        final int a = 1, b = 5; 
  
        for (int i = 0; a < b; i++) { 
            System.out.println("Hello"); //infinite loop since its always true because both variables are final. it never reaches second line 
        } 
      //  System.out.println("Hi"); 
    } 
} 