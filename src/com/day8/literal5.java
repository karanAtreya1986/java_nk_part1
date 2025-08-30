package com.day8;

public class literal5 {
	
	public static void main(String[] args) {
		
		//how to know if static array.
		//add more values, then we get out of bounds.
		
		String[] browser= {"chrome","edge","safari","ff"};
		System.out.println(browser.length);//4
		
		browser[6]="tiger";
		for(String e:browser) {
			System.out.println(e);
		}
	}

}
//4
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
//	at com.day8.literal5.main(literal5.java:13)
