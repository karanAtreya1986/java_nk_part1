package com.day10;

public class emp2 {
	
	//class variable or global variables or template variables.
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	public static void main(String[] args) {
		
		int i=10; //local variable.
		
		//create object using new keyword
		
		emp2 e1=new emp2();
		System.out.println(e1.name); //null
		System.out.println(e1.isPermanent); //false
		System.out.println(e1.age); //0
		System.out.println(e1.salary); //0.0
		System.out.println(e1.gender); //space
		
		//assign values and print it.
		// assign values to the object
        e1.name = "John Doe";
        e1.age = 30;
        e1.salary = 50000.0;
        e1.isPermanent = true;
        e1.gender = 'M';

        // print the values
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Is Permanent: " + e1.isPermanent);
        System.out.println("Gender: " + e1.gender);
		
	}
		

}

//Name: John Doe
//Age: 30
//Salary: 50000.0
//Is Permanent: true
//Gender: M
