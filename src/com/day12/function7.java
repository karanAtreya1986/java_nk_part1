package com.day12;

public class function7 {
	
	public boolean isurban() {
		System.out.println("is urban method");
		return true;
	}
	
	public static void main(String[] args) {
		function7 f6=new function7();
		boolean result=f6.isurban();
		System.out.println(result);
		
		//use the returned variables for further operations.
		if(result) {
			System.out.println("logging in to the system");
		}
	}

	
}

//is urban method
//true
//logging in to the system

