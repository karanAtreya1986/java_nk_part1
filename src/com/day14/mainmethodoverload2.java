package com.day14;

public class mainmethodoverload2 {
	
	public static void main(String[] args) {
		
		//overloaded main calling another main.
		
		System.out.println("this is the boss");
		mainmethodoverload2.main(10);
		
	}
	
	// Overloaded main #1
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
        mainmethodoverload2.main(a, 3423);
        
    }

    // Overloaded main #2
    public static void main(String msg) {
        System.out.println("Overloaded main with String: " + msg);
    }

    // Overloaded main #3
    public static void main(int x, int y) {
        System.out.println("Overloaded main with two ints: " + (x + y));
    }
}

//this is the boss
//Overloaded main with int: 10
//Overloaded main with two ints: 3433


