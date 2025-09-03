package com.day15;

public class emp10 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//static variable.
	static int w;
	
	//create constructor with all arguments.
	public emp10(String name, int age, double salary, boolean isPermanent, char gender) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
		this.gender=gender;
		
		//right way to initialise static.
		emp10.w=34324;
	}
	
	//create main method.
	public static void main(String[] args) {
		
		emp10 e1=new emp10("karan", 4324, -34234.544545,false, 'm');
		System.out.println(e1);
		System.out.println(e1.name + " " + e1.age + " " + e1.gender + " " + e1.salary + " " +e1.isPermanent + " " +emp10.w);
	}
	
}

//com.day15.emp10@5ca881b5
//karan 4324 m -34234.544545 false 34324







