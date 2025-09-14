package com.day27;

public class strinttoint4 {
	
	public static void main(String[] args) {
		
		//replace and then add.
		//replace is now number 100.
		String x="100a";
		String replace = x.replace("a", "");
		int i=Integer.parseInt(replace);
		System.out.println(replace); //100
		
		int add = i+10;
		System.out.println(add); //110
	}

}

