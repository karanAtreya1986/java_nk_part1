package com.day27;

public class converttoboolean1 {
	
	public static void main(String[] args) {
		
		//pass capital false.
		String t1="FALSE";
		
		boolean boolean1 = Boolean.parseBoolean(t1);
		System.out.println(boolean1);
		
		if(boolean1) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}

//false
//fail

