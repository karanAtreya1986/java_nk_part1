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
	page5 p1=new login5();
	p1.loading();
	boolean b2=p1.unloading();
	System.out.println(b2);
	
	
	
	}

}


// child class login title overridden method
// child class url overridden method
// gorilla
// child Page is loading...
// static method with return from childkaran
// chimpaanzee
// static method with return from childaustralia
// chimpaanzee
// final method without returngeorgia
// final method with returncambodia
// lion
// child Page is loading...
// Page is unloading...
// true
// static final method without returngimper
// static final method without returnusa
// static final method with returnjapan
// tiger
// static final method with returncanada
// tiger
// test static without return method
// ---------------
// child Page is loading...
// Page is unloading...
// true

// 1️⃣ Abstract Method Overrides
// l1.title();
// l1.url();


// Runs child class methods:

// child class login title overridden method
// child class url overridden method
// gorilla

// 2️⃣ Overridden Normal Method
// l1.loading();


// Child version is called:

// child Page is loading...

// 3️⃣ Static Method (Method Hiding)
// l1.getstatic("karan");
// login5.getstatic("australia");


// Static methods depend on class name, not object.

// Both call login5 method:

// static method with return from childkaran
// chimpaanzee
// static method with return from childaustralia
// chimpaanzee

// 4️⃣ Final Methods (From Parent)
// l1.getfinal("georgia");
// l1.getfinal1("cambodia");


// Final methods cannot be overridden:

// final method without returngeorgia
// final method with returncambodia
// lion

// 5️⃣ Parent Method (Not Overridden)
// l1.unloading();


// Uses page5 method:

// Page is unloading...
// true

// 6️⃣ Static Final Methods (Parent)
// l1.getstaticfinal("gimper");
// login5.getstaticfinal("usa");
// l1.getstaticfinal1("japan");
// login5.getstaticfinal1("canada");


// All from page5:

// static final method without returngimper
// static final method without returnusa
// static final method with returnjapan
// tiger
// static final method with returncanada
// tiger

// 7️⃣ Static Method test()
// l1.test();

// test static without return method

// 8️⃣ Polymorphism Example
// page5 p1 = new login5();
// p1.loading();
// p1.unloading();


// Dynamic binding applies only to non-static, non-final methods.

// So:

// loading() → child

// unloading() → parent

// ---------------
// child Page is loading...
// Page is unloading...
// true
