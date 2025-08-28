package com.day5;

public class nestedifelse5 {
	
	public static void main(String[] args) {
		
		//Break only for loops. For, while, do while, switch case.

		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome"); 
			break; //break cannot be used outside of a loop or a switch
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



