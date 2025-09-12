package com.day22;

public class test1 {

	public static void main(String[] args) {

		//see how we can create multiple workflows.

		application1 a1=new application1();

		//workflow1
		System.out.println("---------");
		System.out.println("first workflow");
		a1.login("tiger", "password")
		.search("apple")
		.addToCart("laptop pro")
		.doPayment("karan@okicic")
		.generateOrder()
		.logout();

		System.out.println("----------------");

		//second workflow.
		//every method related using this so not mandatory to follow sequence.
		System.out.println("second workflow");
		a1.login("tiger", "password")
		.search("apple")
		.addToCart("laptop pro")
		.logout();

		System.out.println("----------------");

		//third workflow.
		//every method related using this so not mandatory to follow sequence.
		System.out.println("third workflow");
		a1.login("tiger", "password")
		.search("apple", 1000)
		.doPayment("@3434234234", 3234)
		.generateOrder()
		.logout();

		System.out.println("----------------");

		//fourth workflow.
		//every method related using this so not mandatory to follow sequence.
		System.out.println("fourth workflow");
		a1.login("tiger", "password")
		.logout();

		System.out.println("----------------");

		//fifth workflow.
		//every method related using this so not mandatory to follow sequence.
		System.out.println("fifth workflow");
		a1.login("tiger", "password");
		
		System.out.println("----------------");

		//sixth workflow.
		//every method related using this so not mandatory to follow sequence.
		System.out.println("sixth workflow");
		a1.login()
		.search("keys")
		.addToCart("laptop pro")
		.doPayment("karan@okicic")
		.generateOrder()
		.logout();
	}

}

//---------
//first workflow
//login to app with : tiger password
//searching the product: apple
//adding to cart: laptop pro
//making payment using upi : karan@okicic
//your order id is : 12345
//logged out
//----------------
//second workflow
//login to app with : tiger password
//searching the product: apple
//adding to cart: laptop pro
//logged out
//----------------
//third workflow
//login to app with : tiger password
//searching the product: apple price: 1000
//making payment using cc : @3434234234 3234
//your order id is : 12345
//logged out
//----------------
//fourth workflow
//login to app with : tiger password
//logged out
//----------------
//fifth workflow
//login to app with : tiger password
//----------------
//sixth workflow
//login to app
//searching the product: keys
//adding to cart: laptop pro
//making payment using upi : karan@okicic
//your order id is : 12345
//logged out


