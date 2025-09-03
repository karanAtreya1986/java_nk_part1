package com.day15;

public class function2 {
	
	String name; 
	int age;
	
	//we can have any damn thing inside constructor.
	//create static variable string called company name and assign value.
	public static String companyName = "TCS";
	
	//create constructor with two parameters string name and int age.
	//print the value of static variable inside constructor.
	public function2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("company name is " + companyName);
	}
	
	//create main method.
	public static void main(String[] args) {
		//create two objects of function2 class.
		function2 obj1 = new function2("A", 1);
		function2 obj2 = new function2("B", 2);
		
		//print obj1 and obj2 values.
		System.out.println(obj1.name + " " + obj1.age);
		System.out.println(obj2.name + " " + obj2.age);
	}

}

//company name is TCS
//company name is TCS
//A 1
//B 2

