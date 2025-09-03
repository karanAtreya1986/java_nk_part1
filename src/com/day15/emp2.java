package com.day15;

public class emp2 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp2() {
		System.out.println("zero parameter constructor");
	}
	
	//one parameter constructor
	public emp2(int age) {
		System.out.println("1 param constructor " + age);
	}
	
	public emp2(double salary) {
		System.out.println("1 param constructor " + salary);
	}
	
	//2 param constructor.
	//we are assigning local variable to local variable so nothing changes.
	public emp2(String name, int age) {
		name=name;
		age=age;
		
	}
	public static void main(String[] args) {
		
		emp2 e1=new emp2();
		emp2 e2=new emp2(30);
		emp2 e4=new emp2(50000.454350);
		emp2 e5=new emp2("tiger", 30);
		System.out.println(e5.name + " " + e5.age);
		
	}

}

//zero parameter constructor
//1 param constructor 30
//1 param constructor 50000.45435
//null 0

