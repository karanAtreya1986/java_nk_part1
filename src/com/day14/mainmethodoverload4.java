package com.day14;

public class mainmethodoverload4 {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		mainmethodoverload4.main(10);

}
	
	// Overloaded main #1
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
        
    }
    
    public static void main(String[] arr1, String[] arr2) {
    	System.out.println("Karan");
    }
}

//hello
//Overloaded main with int: 10
//only the major main is given importance in overloaded main concept.



