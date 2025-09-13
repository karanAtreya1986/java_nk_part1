package com.day26;

public class stringcompare2 {
	
	public static void main(String[] args) {
		
		//Strings are immutable, once created cannot update original value.
		
		String t1="hello";
		String t2=t1.concat("automation");
		System.out.println(t1); //hello
		System.out.println(t2); //helloautomation
		
	}

}



