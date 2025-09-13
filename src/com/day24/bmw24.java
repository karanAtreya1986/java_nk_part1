package com.day24;


 public class bmw24  extends car4{

	//this is another way to resolve.
	 //create the same constructor in child and add more variables if needed.
	 String address;
	 int phone;

	public bmw24(String name, int price, String color, String chasisnumber, String address
			,int phone) {
		super(name, price, color, chasisnumber);
		System.out.println(this.name);
		System.out.println(name);
		System.out.println(this.price);
		System.out.println(price);
		System.out.println(this.color);
		System.out.println(color);
//		System.out.println(this.chasisnumber);//The field car4.chasisnumber is not visible
		System.out.println(chasisnumber);
		System.out.println("child class constructor");
		System.out.println(this.address);
		System.out.println(address);
		System.out.println(this.phone);
		System.out.println(phone);
	}

	public static void main(String[] args) {

	//public constructor can be accessed in another class.
		car4 c1=new car4("karan", 23434, "green", "@#4324");
		System.out.println(c1);
	
}
 }



// karan
// karan
// 23434
// 23434
// green
// green
// @#4324
// @#4324
// parent class constructor
// com.day24.car4@24d46ca6




