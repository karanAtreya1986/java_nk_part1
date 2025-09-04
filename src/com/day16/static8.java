package com.day16;

public class static8 {
	
	private String name;
	private int age;
	private double salary;
	private boolean isPermanent;
	private static int wheels;
	private static String type;
	private static boolean flag;
	private static double number;
	
	//both ways of declaring ok, with or without this.
	//print the static variables default value.
	public static8() {
		System.out.println("default constructor");
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(salary);
		System.out.println(this.salary);
		System.out.println(isPermanent);
		System.out.println(this.isPermanent);
		System.out.println(wheels);
		System.out.println(this.wheels);//The static field static8.wheels should be accessed in a static way
		System.out.println(type);
		System.out.println(this.type);//The static field static8.type should be accessed in a static way
		System.out.println(flag);
		System.out.println(this.flag);//The static field static8.flag should be accessed in a static way
		System.out.println(number);
		System.out.println(this.number);//The static field static8.number should be accessed in a static way
	}
	
	public static void main(String[] args) {
		
		static8 e1=new static8();
		System.out.println(e1);
		System.out.println(wheels);
		System.out.println(type);
		System.out.println(flag);
		System.out.println(number);
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
//0
//0
//null
//null
//false
//false
//0.0
//0.0
//com.day16.static8@5ca881b5
//0
//null
//false
//0.0



