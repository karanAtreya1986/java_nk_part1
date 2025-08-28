package com.day5;

public class switch1 {
	
	public static void main(String[] args) {
		
		//Switch case better performance than if else as all cases wont be checked.
//		Two case cannot have same name.
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("open chrome");
			break;
		case "chrome": //Duplicate case
			System.out.println("open chrome");
			break;

		default:
			break;
		}

	}

}
