package com.day10;

public class emp3 {
	
	//class variable or global variables or template variables.
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	public static void main(String[] args) {
		
		int i=10; //local variable.
		
		//create object using new keyword
		
		emp3 e1=new emp3();
		System.out.println(e1.name); //null
		System.out.println(e1.isPermanent); //false
		System.out.println(e1.age); //0
		System.out.println(e1.salary); //0.0
		System.out.println(e1.gender); //space
		
        
     // assign values to any two variables
        e1.name = "John Doe";
        e1.age = 30;

        // print all variables' values
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Is Permanent: " + e1.isPermanent);
        System.out.println("Gender: " + e1.gender);
        
        //give some salary
        e1.salary = 50000.0;

		// print all variables' values
		System.out.println("Name: " + e1.name);
		System.out.println("Age: " + e1.age);
		System.out.println("Salary: " + e1.salary);
		System.out.println("Is Permanent: " + e1.isPermanent);
		System.out.println("Gender: " + e1.gender);
		
	}
		

}

//Name: John Doe
//Age: 30
//Salary: 0.0
//Is Permanent: false
//Gender: 

//Name: John Doe
//Age: 30
//Salary: 50000.0
//Is Permanent: false
//Gender: 
