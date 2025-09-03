package com.day15;

public class car1 {
	
	String name;
	double price;
	String modelnumber;
	String color;
	String chasisnumber;
	
	//constructor with two parameters.
	public car1(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	//constructor with two parameters, name and price.
	public car1(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	//constructor with four parameters, name, color, price, model
	public car1(String name, String color, double price, String modelnumber) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.modelnumber=modelnumber;
	}
	
	//constructor with all the five parameters.
	public car1(String name, String color, double price, String modelnumber, String chasisnumber) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.modelnumber=modelnumber;
		this.chasisnumber=chasisnumber;
	}
	
	//main method.
	public static void main(String[] args) {
		//three car objects.
		car1 c1 = new car1("Toyota", 56.89);
		car1 c2 = new car1("Honda", "White", 6789.2345, "H123");
		car1 c3 = new car1("Ford", "Red", 30000, "F123", "F12345");
		
		//print all values from c1, c2, c3.
		System.out.println(c1.name + " " + c1.price + " "+ c1.modelnumber + " " + c1.chasisnumber + " " + c1.color);
		System.out.println(c2.name + " " + c2.price + " "+ c2.modelnumber + " " + c2.chasisnumber + " " + c2.color);;
		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + c3.modelnumber + " " + c3.chasisnumber);
	}

}

//Toyota 56.89 null null null
//Honda 6789.2345 H123 null White
//Ford Red 30000.0 F123 F12345
