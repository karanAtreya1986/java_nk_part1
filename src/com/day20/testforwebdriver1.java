package com.day20;

public class testforwebdriver1 {

	public static void main(String[] args) {

		chromedriver1 driver=new chromedriver1();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.sendKeys("search chrome", "chrome browser search is happening");
		driver.click("search chrome");
		driver.close();

		System.out.println("--------------");

		ffdriver1 driver1=new ffdriver1();
		driver1.get("https://www.google.com/");
		String title1=driver1.getTitle();
		System.out.println(title1);
		driver1.sendKeys("search ff", "ff browser search is happening");
		driver1.click("search ff");
		driver1.close();

		System.out.println("--------------");

		safaridriver1 driver2=new safaridriver1();
		driver2.get("https://www.google.com/");
		String title2=driver2.getTitle();
		System.out.println(title2);
		driver2.sendKeys("search safari", "safari browser search is happening");
		driver2.click("search safari");
		driver2.close();
	}

}

//default constructor of chrome driver class
//Launching Chrome browser and navigating to: https://www.google.com/
//Getting the page title from Chrome browser...
//Sample Chrome Page Title
//Typing 'chrome browser search is happening' into element: search chrome in Chrome browser
//Clicking on element: search chrome in Chrome browser
//Closing Chrome browser
//--------------
//default constructor of ff driver class
//Launching ff browser and navigating to: https://www.google.com/
//Getting the page title from ff browser...
//Sample ff Page Title
//Typing 'ff browser search is happening' into element: search ff in ff browser
//Clicking on element: search ff in ff browser
//Closing ff browser
//--------------
//default constructor of safari driver class
//Launching safari browser and navigating to: https://www.google.com/
//Getting the page title from safari browser...
//Sample ff Page Title
//Typing 'safari browser search is happening' into element: search safari in safari browser
//Clicking on element: search safari in safari browser
//Closing safari browser

