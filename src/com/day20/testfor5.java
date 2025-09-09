package com.day20;

public class testfor5 {
	
	public static void main(String[] args) {
		
		login5 l1 =new login5();
		l1.title();
		String s1=l1.url();
		System.out.println(s1);
		l1.loading();
	String s2	=l1.getstatic("karan");
	//warning for static.
	//The static method getstatic(String) from the type 
	//login5 should be accessed in a static way
	System.out.println(s2);
	String s3=login5.getstatic("australia");
	System.out.println(s3);
	l1.getfinal("georgia");
	String s4=l1.getfinal1("cambodia");
	System.out.println(s4);
	l1.loading();
	boolean b1=l1.unloading();
	System.out.println(b1);
	l1.getstaticfinal("gimper");
	//warning for static.
	//The static method getstaticfinal(String) from the type page5 
	//should be accessed in a static way
	login5.getstaticfinal("usa");
	String s5=l1.getstaticfinal1("japan");
	System.out.println(s5);
	//static warning.
	//The static method getstaticfinal1(String) from 
	//the type page5 should be accessed in a static way
	String s6=login5.getstaticfinal1("canada");
	System.out.println(s6);
	l1.test();
	
	//cannot create object of abstract.
	//Cannot instantiate the type page6
//	page6 p1=new page6();
	
	//can access only page methods not the child classes.
	System.out.println("---------------");
	page6 p1=new login6();
	p1.loading();
	boolean b2=p1.unloading();
	System.out.println(b2);
	
	
	
	}

}

//child class login title overridden method
//child class url overridden method
//gorilla
//child Page is loading...
//static method with return from childkaran
//chimpaanzee
//static method with return from childaustralia
//chimpaanzee
//final method without returngeorgia
//final method with returncambodia
//lion
//child Page is loading...
//Page is unloading...
//true
//static final method without returngimper
//static final method without returnusa
//static final method with returnjapan
//tiger
//static final method with returncanada
//tiger
//test static without return method
//---------------
//Page is loading...
//child class override unloading
//true

