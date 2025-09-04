package com.day16;

public class static7 {
	
private String name;
private int age;
private double salary;
private boolean isperm;
static int wheels=34234; 

public static7(String name, int age, double salary, boolean isperm {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.isperm=isperm;
	static7.wheels; //Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
	System.out.println("constructor call.");
}

public static void main(String[] args) {
	
	static7 s1=new static7("karan", 10, 50000.0, true);
	System.out.println(s1);
	System.out.println(wheels);
	
}
}



