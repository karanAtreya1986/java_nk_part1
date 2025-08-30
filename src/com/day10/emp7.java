package com.day10;

public class emp7 {
	
	//class variable or global variables or template variables.
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	public static void main(String[] args) {
		
		int i=10; //local variable.
		
		//anti pattern and dont use it.
		
		//no reference objects.
		
		//can print the no reference directly.
		
		new emp4().name="karan";
		new emp4().age=30;
		
		System.out.println(new emp4().name="karan");
		System.out.println(new emp4().age=30);
		
	}
		
}

//karan
//30


