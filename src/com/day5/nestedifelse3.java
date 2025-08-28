package com.day5;

public class nestedifelse3 {
	
	public static void main(String[] args) {
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome"); //open chrome
		}
		if(browser.equals("edge")) {
			System.out.println("open edge");
		}
		if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		if(browser.equals("ff")) {
			System.out.println("open ff");
		}
		else {
			System.out.println("pass right browser"); //pass right browser
		}
		
	}

}

//open chrome
//pass right browser
//This is because last if condition not satisfied so else also executed.

