package com.day16;

public class static2 {
	
private String name;
private int age;
private double salary;
private boolean isperm;
static int wheels=5; //assign value to static here.

public static2(String name, int age, double salary, boolean isperm) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.isperm=isperm;
	this.wheels=56; //reassign in constructor using this.
	//warning.
	//The static field static1.wheels should be accessed in a static way
	System.out.println("constructor call.");
}

public static void main(String[] args) {
	
	static2 s1=new static2("karan", 10, 50000.0, true);
	System.out.println(s1);
	System.out.println(wheels);
	
}
}

//constructor call.
//com.day16.static2@5ca881b5
//56