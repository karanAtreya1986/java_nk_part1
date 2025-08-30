package com.day11;

public class car1 {
	
	String name;
	int price;
	String modelnumber;
	static int wheels=4;
	
	public static void main(String[] args) {
		
		// create three objects of car1
        car1 c1 = new car1();
        car1 c2 = new car1();
        car1 c3 = new car1();

        // assign values to the objects
        c1.name = "Toyota";
        c1.price = 20000;
        c1.modelnumber = "T123";
        c1.wheels=34324; //warning - The static field car1.wheels should be accessed in a static way
        

        c2.name = "Honda";
        c2.price = 25000;
        c2.modelnumber = "H456";
        c2.wheels=34343; //warning - The static field car1.wheels should be accessed in a static way

        c3.name = "Ford";
        c3.price = 30000;
        c3.modelnumber = "F789";
        c1.wheels=2343432; //warning - The static field car1.wheels should be accessed in a static way
	}
	
	

}
