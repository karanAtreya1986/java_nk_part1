package com.day20;

public class testforwebdriver4 {

	public static void main(String[] args) {

		//top casting solves manual changes.
		String browsername ="chrome";
		webdriver4 driver=null;
		
		switch(browsername.trim().toLowerCase()){
		case "chrome":
			driver=new chromedriver4();
			break;
		case "ff":
			driver=new ffdriver4();
			break;
		case "safari":
			driver=new safaridriver4();
			break;
		default:
			System.out.println("invalid browser name " + browsername);
			break;
			}
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.sendKeys("search chrome", "chrome browser search is happening");
		driver.click("search chrome");
		driver.close();
	
	}

}

//default constructor of chrome driver class
//Launching Chrome browser and navigating to: https://www.google.com/
//Getting the page title from Chrome browser...
//Sample Chrome Page Title
//Typing 'chrome browser search is happening' into element: search chrome in Chrome browser
//Clicking on element: search chrome in Chrome browser
//get logs
//Closing Chrome browser
//get locations
//kanada








