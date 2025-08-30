package com.day6;

public class for10 {
	
	
	public static void main(String[] args) {
		
		//even one colon is missing then error.
		int i=1;
		
		for (;) { //Syntax error on token ";", ; expected after this token
			System.out.println(i); 
			i++;
		}
	}

}