package com.day15;

public class emp3 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp3() {
		System.out.println("zero parameter constructor");
	}
	
	//one parameter constructor
	public emp3(int age) {
		System.out.println("1 param constructor " + age);
	}
	
	public emp3(double salary) {
		System.out.println("1 param constructor " + salary);
	}
	
	//2 param constructor.
	//change local variable name.
	//assign it to our class variable.
	// it works.
	public emp3(String name1, int age1) {
		name=name1;
		age=age1;
		
	}
	public static void main(String[] args) {
		
		emp3 e1=new emp3();
		emp3 e2=new emp3(30);
		emp3 e4=new emp3(50000.454350);
		emp3 e5=new emp3("tiger", 30);
		System.out.println(e5.name + " " + e5.age);
		
	}

}

//zero parameter constructor
//1 param constructor 30
//1 param constructor 50000.45435
//tiger 30


