package com.day20;

public class safaridriver1 implements webdriver1 {
	
	//constructor.
	public safaridriver1() {
		System.out.println("default constructor of safari driver class");
	}

	@Override
    public void get(String url) {
        System.out.println("Launching safari browser and navigating to: " + url);
    }

    @Override
    public String getTitle() {
        System.out.println("Getting the page title from safari browser...");
        return "Sample ff Page Title";
    }

    @Override
    public void click(String element) {
        System.out.println("Clicking on element: " + element + " in safari browser");
    }

    @Override
    public void sendKeys(String element, String value) {
        System.out.println("Typing '" + value + "' into element: " + element + " in safari browser");
    }

    @Override
    public void close() {
        System.out.println("Closing safari browser");
    }
	

}
