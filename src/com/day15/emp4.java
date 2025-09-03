package com.day15;

public class emp4 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp4() {
		System.out.println("zero parameter constructor");
	}
	
	//one parameter constructor
	public emp4(int age) {
		System.out.println("1 param constructor " + age);
	}
	
	public emp4(double salary) {
		System.out.println("1 param constructor " + salary);
	}
	
	//2 param constructor.
	//best way to access is use this keyword.
	public emp4(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args) {
		
		emp4 e1=new emp4();
		emp4 e2=new emp4(30);
		emp4 e4=new emp4(50000.454350);
		emp4 e5=new emp4("tiger", 30);
		System.out.println(e5.name + " " + e5.age);
		System.out.println(e5.salary + " " + e5.isPermanent + " " + e5.gender);
		
	}

}

//zero parameter constructor
//1 param constructor 30
//1 param constructor 50000.45435
//tiger 30
//0.0 false 



