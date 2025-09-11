package com.day21;

public class browser1 {
	
	//this can be used with any setter, getter, constructor,
	//method etc.

	String name;
    double version;
    
    public void addBrowser(String name, double version) {
        this.name = name;
        this.version = version;
        System.out.println(this.name);
        System.out.println(this.version);
    }
    
    public static void main(String[] args) {
    	browser1 br = new browser1();
        br.addBrowser("chrome", 124.56);
	}
}

//chrome
//124.56
