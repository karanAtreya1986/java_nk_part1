package com.day20;

public class ffdriver4 implements webdriver4 {
	
	//constructor.
	public ffdriver4() {
		System.out.println("default constructor of ff driver class");
	}

	@Override
    public void get(String url) {
        System.out.println("Launching ff browser and navigating to: " + url);
    }

    @Override
    public String getTitle() {
        System.out.println("Getting the page title from ff browser...");
        return "Sample ff Page Title";
    }

    @Override
    public void click(String element) {
        System.out.println("Clicking on element: " + element + " in ff browser");
    }

    @Override
    public void sendKeys(String element, String value) {
        System.out.println("Typing '" + value + "' into element: " + element + " in ff browser");
    }

    @Override
    public void close() {
        System.out.println("Closing ff browser");
    }
	

}
