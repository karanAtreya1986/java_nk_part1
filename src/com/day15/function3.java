package com.day15;

public class function3 {
	
	String name; 
	int age;
	
	//we can have any damn thing inside constructor.
	//create static variable string called company name and assign value.
	public static String companyName = "TCS";
	
	
	//create constructor with two parameters string name and int age.
	//print the value of static variable inside constructor.
	public function3(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("company name is " + companyName);
	}
	
	//create main method.
	public static void main(String[] args) {
	
		//create default constructor.
		//now no one can create any object of the class just randomly without parameters.
		function3 obj1 = new function3(); //The constructor function3() is undefined
		
		
	}

}



