package com.day27;

public class converttoboolean2 {
	
	public static void main(String[] args) {
		
		//pass capital true.
		
		String t1="TRUE";
		
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

//true
//pass

