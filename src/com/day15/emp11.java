package com.day15;

public class emp11 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//static variable.
	static int w;
	
	//create constructor with all arguments.
	//passed static into constructor also.
	//no error.
	public emp11(String name, int age, double salary, boolean isPermanent, char gender, int w) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
		this.gender=gender;
		
		//initialised static with this.
		//not right way.
		//warning.
		//The static field emp11.w should be accessed in a static way
		this.w=34324;
	}
	
	//create main method.
	public static void main(String[] args) {
		
		emp11 e1=new emp11("karan", 4324, -34234.544545,false, 'm', 50);
		System.out.println(e1);
		System.out.println(e1.name + " " + e1.age + " " + e1.gender + " " + e1.salary + " " 
		+e1.isPermanent + " " +emp11.w);
	}
	
}

//com.day15.emp11@5ca881b5
//karan 4324 m -34234.544545 false 34324








