package com.day15;

public class emp7 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp7() {
		System.out.println("zero parameter constructor");
	}
	
	//4 param constructor.
	public emp7(String name, int age, double salary, boolean isPermanent) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
	}
	
	//5 param constructor.
	public emp7(String name, int age, double salary, boolean isPermanent, char gender) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		
		emp7 e1=new emp7("tiger", 30, 50000.454350, true, 'M');
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPermanent + " " + e1.gender);
		
	}

}

//tiger 30 50000.45435 true M





