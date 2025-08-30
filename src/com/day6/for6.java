package com.day6;

public class for6 {
	
	
	public static void main(String[] args) {
		
		//condition cannot be false.
		//we cannot go inside the loop.
		
		for (int i = 0;false;) {
			System.out.println(i); //Unreachable code
			i++;
		}
	}

}


