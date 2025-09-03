package com.day15;

public class emp8 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp8() {
		System.out.println("zero parameter constructor");
	}
	
	//4 param constructor.
	public emp8(String name, int age, double salary, boolean isPermanent) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
	}
	
	//5 param constructor.
	public emp8(String name, int age, double salary, boolean isPermanent, char gender) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		
		emp8 e1=new emp8("tiger", 30, 50000.454350, true, 'M');
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPermanent + " " + e1.gender);
		
		//update values and print.
		e1.salary=1000.0;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPermanent + " " + e1.gender);
		
	}

}

//tiger 30 50000.45435 true M
//tiger 30 1000.0 true M





