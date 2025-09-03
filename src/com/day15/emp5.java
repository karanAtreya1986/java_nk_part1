package com.day15;

public class emp5 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp5() {
		System.out.println("zero parameter constructor");
	}
	
	//one parameter constructor
	public emp5(int age) {
		System.out.println("1 param constructor " + age);
	}
	
	public emp5(double salary) {
		System.out.println("1 param constructor " + salary);
	}
	
	//2 param constructor.
	//best way to access is use this keyword.
	public emp5(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//4 param constructor.
	public emp5(String name, int age, double salary, boolean isPermanent) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
	}
	
	public static void main(String[] args) {
		
		emp5 e1=new emp5();
		emp5 e2=new emp5(30);
		emp5 e4=new emp5(50000.454350);
		emp5 e5=new emp5("tiger", 30);
		System.out.println(e5.name + " " + e5.age);
		System.out.println(e5.salary + " " + e5.isPermanent + " " + e5.gender);
		emp5 e6=new emp5("tiger", 30, 50000.454350, true);
		System.out.println(e6.name + " " + e6.age + " " + e6.salary + " " + e6.isPermanent + " " + e6.gender);
		
	}

}

//zero parameter constructor
//1 param constructor 30
//1 param constructor 50000.45435
//tiger 30
//0.0 false 
//tiger 30 50000.45435 true 



