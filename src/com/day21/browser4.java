package com.day21;

public class browser4 implements automation3{

	String name;
	double version;

	public void addBrowser(String name, double version) {
		this.name = name;
		this.version = version;
		System.out.println(this.name);
		System.out.println(this.version);

		//This static method of interface automation3 can only be accessed as automation3.billing
//		automation3.super.billing(25);
		automation3.billing(23432432);
		
		//This static method of interface automation3 can only be accessed as automation3.billing
//		String s11=automation3.super.billing(67);
		String s11=automation3.billing(67);
		System.out.println(s11);
		
		//No enclosing instance of the type automation3 is accessible in scope
//		int i1=automation3.super.time;
		int time2 = automation3.time;
		System.out.println("time from interface " + time2);
	}

	public static void main(String[] args) {

		browser4 b1=new browser4();
		b1.addBrowser("chrome", 435435);
	}
}

//chrome
//435435.0
//billing in interface
//billing in interface
//a67
//time from interface 10







