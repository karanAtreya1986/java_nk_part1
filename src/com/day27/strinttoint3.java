package com.day27;

public class strinttoint3 {
	
	public static void main(String[] args) {
		
		//replace and then add.
		//replace is still string 100.
		String x="100a";
		String replace = x.replace("a", "");
		System.out.println(replace); //100
		
		int add = Integer.parseInt(replace+10);//10010
		System.out.println(add);
	}

}

