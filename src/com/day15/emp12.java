package com.day15;

public class emp12 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//static variable.
	static int w;
	
	//create constructor with all arguments.
	//not pasted the static to constructor.
	//no error.
	public emp12(String name, int age, double salary, boolean isPermanent, char gender) {
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
		
		emp12 e1=new emp12("karan", 4324, -34234.544545,false, 'm');
		System.out.println(e1);
		System.out.println(e1.name + " " + e1.age + " " + e1.gender + " " + e1.salary + " "
		+e1.isPermanent + " " +emp12.w);
	}
	
}

//com.day15.emp12@5ca881b5
//karan 4324 m -34234.544545 false 34324
