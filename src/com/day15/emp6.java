package com.day15;

public class emp6 {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor present to avoid unnecessary object creations.
	//zero parameterized constructor
	//Constructor overloading possible.
	
	
	
	//one parameter constructor
	public emp6(int age) {
		System.out.println("1 param constructor " + age);
	}
	
	public emp6(double salary) {
		System.out.println("1 param constructor " + salary);
	}
	
	//2 param constructor.
	//best way to access is use this keyword.
	public emp6(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//4 param constructor.
	public emp6(String name, int age, double salary, boolean isPermanent) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPermanent=isPermanent;
	}
	
	public static void main(String[] args) {
		
		//when default constructor or the specific type of constructor not there,
		//then we get below errro.
		emp6 e1=new emp6(); //The constructor emp6() is undefined
		emp6 e2=new emp6(30);
		emp6 e4=new emp6(50000.454350);
		emp6 e5=new emp6("tiger", 30);
		System.out.println(e5.name + " " + e5.age);
		System.out.println(e5.salary + " " + e5.isPermanent + " " + e5.gender);
		emp6 e6=new emp6("tiger", 30, 50000.454350, true);
		System.out.println(e6.name + " " + e6.age + " " + e6.salary + " " + e6.isPermanent + " " + e6.gender);
		
	}

}




