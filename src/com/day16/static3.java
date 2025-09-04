package com.day16;

public class static3 {
	
private String name;
private int age;
private double salary;
private boolean isperm;
static int wheels; //dont assign value here.

public static3(String name, int age, double salary, boolean isperm) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.isperm=isperm;
	static3.wheels=56; //assign in constructor using class name.
	System.out.println("constructor call.");
}

public static void main(String[] args) {
	
	static3 s1=new static3("karan", 10, 50000.0, true);
	System.out.println(s1);
	System.out.println(wheels);
	
}
}

//constructor call.
//com.day16.static3@5ca881b5
//56
