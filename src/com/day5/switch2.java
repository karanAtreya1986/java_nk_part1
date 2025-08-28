package com.day5;

public class switch2 {
	
	public static void main(String[] args) {
		
		//Switch case better performance than if else as all cases wont be checked.
//		Two case cannot have same name.
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("open chrome"); //open chrome
			break;
		case "ff": 
			System.out.println("open ff");
			break;

		default:
			System.out.println("invalid case");
			break;
		}

	}

}
