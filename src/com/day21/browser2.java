package com.day21;

public class browser2 implements automation1{
	
	String name;
    double version;
    
    public void addBrowser(String name, double version) {
        this.name = name;
        this.version = version;
        System.out.println(this.name);
        System.out.println(this.version);
    }
    
    public static void main(String[] args) {
    	browser2 br = new browser2();
        br.addBrowser("chrome", 124.56);
        
        int i=time;
        System.out.println(i);
        
//        super.//cannot use super with interface.
        //we wont get options after super.
        
        //interface variables can be directly accessed using interface name.
        //they are public static.
        int i2=automation1.time;
        System.out.println(i2);
        
        //can we try changing interface variable value.
        //can access interface variable using child class name also.
        int i3=browser2.time;
        System.out.println(i3);
        
        //interface variables are also final.
        //cannot change.
        //The final field automation1.time cannot be assigned
        automation1.time=100;
        //The final field automation1.time cannot be assigned
        browser2.time=34554;
        
        //No enclosing instance of the type automation1 is accessible in scope
        //not allowed.
        System.out.println(automation1.super.time);
        
        //Cannot use super in a static context
        //time cannot be resolved or is not a field
        System.out.println(browser2.super.time);
	}
}

//chrome
//124.56
//10
//10
//10

