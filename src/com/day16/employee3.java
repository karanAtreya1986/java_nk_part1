package com.day16;

public class employee3 {
	
	private String name;
	private int age;
	private double salary;
	private boolean isPermanent;
	
	//both ways of declaring ok, with or without this.
	public employee3() {
		System.out.println("default constructor");
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(salary);
		System.out.println(this.salary);
		System.out.println(isPermanent);
		System.out.println(this.isPermanent);
	}
	
	public static void main(String[] args) {
		
		employee3 e1=new employee3();
		System.out.println(e1);
	}

}

//default constructor
//0
//0
//null
//null
//0.0
//0.0
//false
//false
//com.day16.employee3@5ca881b5

