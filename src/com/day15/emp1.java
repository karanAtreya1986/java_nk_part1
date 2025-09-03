package com.day15;

public class emp1 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	public emp1() {
		System.out.println("zero parameter constructor");
	}
	
	//one parameter constructor
	public emp1(int age) {
		System.out.println("1 param constructor " + age);
	}
	
	public emp1(double salary) {
		System.out.println("1 param constructor " + salary);
	}
	
	//2 param constructor.
	public emp1(String name, int age) {
		
	}
	public static void main(String[] args) {
		
		emp1 e1=new emp1();
		emp1 e2=new emp1(30);
//		emp1 e3=new emp1("tiger");//The constructor emp1(String) is undefined
		//when we try to constructor which is not present.
		emp1 e4=new emp1(50000.454350);
		emp1 e5=new emp1("tiger", 30);
		System.out.println(e5.name + " " + e5.age);
		
	}

}

//zero parameter constructor
//1 param constructor 30
//1 param constructor 50000.45435
//null 0
