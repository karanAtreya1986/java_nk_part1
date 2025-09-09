package com.day20;

public class chromedriver2 implements webdriver2 {
	
	//constructor.
	public chromedriver2() {
		System.out.println("default constructor of chrome driver class");
	}

	@Override
    public void get(String url) {
        System.out.println("Launching Chrome browser and navigating to: " + url);
    }

    @Override
    public String getTitle() {
        System.out.println("Getting the page title from Chrome browser...");
        return "Sample Chrome Page Title";
    }

    @Override
    public void click(String element) {
        System.out.println("Clicking on element: " + element + " in Chrome browser");
    }

    @Override
    public void sendKeys(String element, String value) {
        System.out.println("Typing '" + value + "' into element: " + element + " in Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }
	

}
