package com.day27;

public class converttoboolean4 {
	
	//In java true/false can be in any case.

	
	public static void main(String[] args) {
		
		//pass False.
		
		String t1="False";
		
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

