package com.day10;

public class emp1 {
	
	//class variable or global variables or template variables.
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	public static void main(String[] args) {
		
		int i=10; //local variable.
		
		//create object using new keyword
		
		emp1 e1=new emp1();
		System.out.println(e1.name); //null
		System.out.println(e1.isPermanent); //false
		System.out.println(e1.age); //0
		System.out.println(e1.salary); //0.0
		System.out.println(e1.gender); //space
		
	}
		

}
