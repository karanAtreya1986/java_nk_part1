package com.day16;

public class static6 {
	
private String name;
private int age;
private double salary;
private boolean isperm;
static int wheels=34234; 

//what ever is in constructor that is the last value of static so it gets printed.

public static6(String name, int age, double salary, boolean isperm, int wheels) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.isperm=isperm;
	static6.wheels=4234324;
	System.out.println("constructor call.");
}

public static void main(String[] args) {
	
	static6 s1=new static6("karan", 10, 50000.0, true, 3423432);
	System.out.println(s1);
	System.out.println(wheels);
	
}
}

//constructor call.
//com.day16.static6@5ca881b5
//4234324


