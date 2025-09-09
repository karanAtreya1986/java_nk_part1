package com.day20;

public interface webdriver2 {

	public void get(String url);

	public String getTitle();

	public void click(String element);

	public void sendKeys(String element, String value);

	public void close();

}
