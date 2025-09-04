package com.day16;

public class static5 {
	
private String name;
private int age;
private double salary;
private boolean isperm;
static int wheels=34234; 

public static5(String name, int age, double salary, boolean isperm, int wheels) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.isperm=isperm;
	this.wheels=4234324; //The static field static5.wheels should be accessed in a static way
	System.out.println("constructor call.");
}

public static void main(String[] args) {
	
	static5 s1=new static5("karan", 10, 50000.0, true, 3423432);
	System.out.println(s1);
	System.out.println(wheels);
	
}
}

//constructor call.
//com.day16.static5@5ca881b5
//4234324


