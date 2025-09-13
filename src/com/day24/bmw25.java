package com.day24;


 public class bmw25  extends car5{

	//this is another way to resolve.
	 //create the same constructor in child and add more variables if needed.
	 String address;
	 int phone;

	 //Implicit super constructor car5() 
	 //is undefined. Must explicitly invoke another constructor
	public bmw25(String name, int price, String color, String chasisnumber, String address
			,int phone) {
		//The constructor car5(String, int, String, String) is not visible
		//private constructor cannot be accessed from outside class.
//		super(name, price, color, chasisnumber);
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

	//private constructor cannot be accessed in another class.
		//The constructor car5(String, int, String, String) is not visible
		car5 c1=new car5("karan", 23434, "green", "@#4324");
		System.out.println(c1);
	
}
 }




