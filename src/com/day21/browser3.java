package com.day21;

public class browser3 implements automation2{

	String name;
	double version;

	public void addBrowser(String name, double version) {
		this.name = name;
		this.version = version;
		System.out.println(this.name);
		System.out.println(this.version);

		String s1=	billing(10);
		System.out.println(s1);
		
//		super.//no options after super to call parent.
		
		automation2.super.billing(25);
		
		String s11=automation2.super.billing(67);
		System.out.println(s11);
		
		
		//No enclosing instance of the type automation2 is accessible in scope
//		int i1=automation2.super.time;
	}

	public static void main(String[] args) {

		browser3 b1=new browser3();
		String s2=b1.billing(45);
		System.out.println(s2);
//		super.//no options after super.
		b1.addBrowser("chrome", 435435);
		
		//Cannot use super in a static context
//		automation2.super.billing(10);
		
		//No enclosing instance of the type automation2 is accessible in scope
//		int i1=automation2.super.time;

	}
}

//billing in interface
//a45
//chrome
//435435.0
//billing in interface
//a10
//billing in interface
//billing in interface
//a67






