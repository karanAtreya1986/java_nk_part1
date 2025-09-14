package com.day27;

public class strtoboolean1 {
	
	public static void main(String[] args) {
		
		String t1="true";
		
		boolean boolean1 = Boolean.parseBoolean(t1);
		
		if(boolean1) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}

//pass
