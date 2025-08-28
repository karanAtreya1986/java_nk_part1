package com.day5;

public class nestedifelse4 {
	
	public static void main(String[] args) {
		
		//use else if and solve problem.
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome"); //open chrome
		}
		else if(browser.equals("edge")) {
			System.out.println("open edge");
		}
		else if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		else if(browser.equals("ff")) {
			System.out.println("open ff");
		}
		else {
			System.out.println("pass right browser"); 
		}
		
	}

}



