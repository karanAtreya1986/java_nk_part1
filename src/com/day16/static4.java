package com.day16;

public class static4 {
	
private String name;
private int age;
private double salary;
private boolean isperm;
static int wheels=34234; // assign value here.

public static4(String name, int age, double salary, boolean isperm) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.isperm=isperm;
	static4.wheels=565654; //assign in constructor using class name.
	System.out.println("constructor call.");
}

public static void main(String[] args) {
	
	static4 s1=new static4("karan", 10, 50000.0, true);
	System.out.println(s1);
	System.out.println(wheels);
	
}
}

//constructor call.
//com.day16.static4@5ca881b5
//565654

