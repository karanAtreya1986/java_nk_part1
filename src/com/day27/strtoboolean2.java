package com.day27;

public class strtoboolean2 {
	
	public static void main(String[] args) {
		
		//pass invalid boolean value and convert.
		//we get fail.
		String t1="karan";
		
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

