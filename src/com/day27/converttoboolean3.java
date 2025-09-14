package com.day27;

public class converttoboolean3 {
	
	public static void main(String[] args) {
		
		//pass True.
		
		String t1="True";
		
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

